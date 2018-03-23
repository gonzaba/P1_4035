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
	
	public static int[] parms = {10, 50, 100, 50000, 1000, 200};
		
	

	public static <E> void main(String[] args) throws FileNotFoundException {
		if(args.length>6)
			System.out.println("Unexpected number of parameters. Must me <= 6.");
		
		for (int i=0; i<args.length; i++)
			parms[i] = Integer.parseInt(args[i]); 		
		// Parm1: number of companies
		// Parm2: number of crimes
		// Parm3: initial size
		// Parm4: trials per size
		// Parm5: incremental steps (size)
		// Parm6: last size to consider
				
		ExperimentController ec = new ExperimentController(parms[0], parms[1], parms[2], parms[3], parms[4], parms[5]);
		
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
