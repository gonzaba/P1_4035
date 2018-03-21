package p1MainClasses;

import java.io.FileNotFoundException;

import dataGenerator.DataReader;
import setIntersectionFinders.P1andP2;
import setIntersectionFinders.P3;
import setIntersectionFinders.P4;

/**
 * 
 * @author Bárbara P. González Rivera - 802-14-2976
 * @author Ramineh Lopez - 402-12-3657
 *
 */


public class Part2Main {
		  public static void main(String[] args) throws FileNotFoundException {
			  
			  DataReader dr = new DataReader();
			  
			  	P1andP2 p1result = new P1andP2(null);
			  	P1andP2 p2result = new P1andP2(null);
				P3 p3result = new P3(null);
				P4 p4result = new P4(null);
		  }

}
