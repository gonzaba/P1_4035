package p1MainClasses;

import java.io.FileNotFoundException;
import java.util.AbstractMap;

import dataGenerator.DataReader;
import setIntersectionFinders.AbstractIntersectionFinder;
import setIntersectionFinders.P1andP2;
import setIntersectionFinders.P3;
import setIntersectionFinders.P4;


import java.util.ArrayList;
/**
 * 
 * @author B�rbara P. Gonz�lez Rivera - 802-14-2976
 * @author Ramineh Lopez - 402-12-3657
 *
 */


public class Part2Main {
	

	public static void main(String[] args) throws FileNotFoundException {
		// Parm1: initial size
		// Parm2: trials per size
		// Parm3: incremental steps (size)
		// Parm4: last size to consider
		
		ExperimentController ec = new ExperimentController(50, 200, 50, 1000);
				
	
		ec.addStrategy(new StrategiesTimeCollection<Integer>(new ??? )); 
		ec.addStrategy(new StrategiesTimeCollection<Integer>(new ??? )); 
		ec.addStrategy(new StrategiesTimeCollection<Integer>(new ??? )); 
		
		ec.run();
		
		  }//end of main

		  
		  
}
