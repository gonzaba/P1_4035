package p1MainClasses;

import java.io.FileNotFoundException;
import dataGenerator.DataReader;

/**
 * 
 * @author Barbara P. Gonzalez 802-14-2976
 *
 */


//Leer Data generada por FilesGeneratorMain
//Enviar dicha data a P1andP2, P3 y P4

public class Part1Main {

	  public static void main(String[] args) throws FileNotFoundException {
		  
			P1andP2 p1p2result = new P1andP2(null);
			  
			P3 p3result = new P3(null);
			P4 p4result = new P4(null);
				
			DataReader dr = new DataReader();
			FilesGeneratorMain fgm = new FilesGeneratorMain();
			//Calling the FilesGeneratorMain to read the files
			
			
			//tells the FilesGeneratorMain to read the arguments given by user 
			//when calling part1main by cmd and giving the numbers
			//FilesGeneratorMain has already a method to read the arguments or assign a default value.
		//	fgm.main(args);
			
			//Returns a matrix 3x3 with 
			//[company][event][phone]
			
			//need to save this on a variable
			
			
			//dr.readDataFiles();
			
			//dr.printSets();
		
	
		  
	  }
}
