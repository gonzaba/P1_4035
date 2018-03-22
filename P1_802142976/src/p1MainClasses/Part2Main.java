package p1MainClasses;

import java.io.FileNotFoundException;
import java.util.AbstractMap;

import dataGenerator.DataReader;
import interfaces.IntersectionFinder;
import setIntersectionFinders.AbstractIntersectionFinder;
import setIntersectionFinders.P1andP2;
import setIntersectionFinders.P3;
import setIntersectionFinders.P4;


import java.util.ArrayList;
/**
 * 
 * @author Bárbara P. González Rivera - 802-14-2976
 * @author Ramineh Lopez - 402-12-3657
 *
 */


public class Part2Main {
	

	public static <E> void main(String[] args) throws FileNotFoundException {
		// Parm1: number of companies
		// Parm2: number of crimes
		// Parm3: initial size
		// Parm4: trials per size
		// Parm5: incremental steps (size)
		// Parm6: last size to consider
		
		String x="0";
		if(args.length>0)x=args[0];
		
		
		ExperimentController ec = new ExperimentController(2, 2, 2, 2, 2, 2);
		
		IntersectionFinder<E> af= new P1andP2<E>("p1");
		IntersectionFinder<E> af2=new P1andP2<E>("p2");
		IntersectionFinder<E> af3=new P3<E>("p3");
		IntersectionFinder<E> af4=new P4<E>("p4");
		
	
		ec.addStrategy(new StrategiesTimeCollection<Integer>((IntersectionFinder<Integer>) af)); 
		ec.addStrategy(new StrategiesTimeCollection<Integer>((IntersectionFinder<Integer>) af2)); 
		ec.addStrategy(new StrategiesTimeCollection<Integer>((IntersectionFinder<Integer>) af3)); 
		ec.addStrategy(new StrategiesTimeCollection<Integer>((IntersectionFinder<Integer>) af4)); 
		
		
		ec.run();
		
		
		try {
			ec.saveResults();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //end of catch
		
		  }//end of main

		  
		  
}
