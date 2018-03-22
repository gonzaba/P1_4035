package p1MainClasses;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import setIntersectionFinders.AbstractIntersectionFinder;
import setIntersectionFinders.P1andP2;
import setIntersectionFinders.P3;
import setIntersectionFinders.P4;

/**
 * 
 * @author Bárbara P. González Rivera - 802-14-2976
 * @author Ramineh Lopez - 402-12-3657
 *
 */



/**
* Reads all input data.
* a- read an initial file parameters.txt that contains two integer value n and m
* in that order one per line.
* b- real all F_i_j files for values n and m.  Program ends if there is an exception
* , carrying an appropriate message.
* c- from input it constructs 
* 
*/


public class Part1Main {
	public static <E> void main(String[] args) throws IOException{
				
				int co,cr;
				
				String parentDirectory = "inputFiles";
				Scanner parameters = new Scanner(new File(parentDirectory, "parameters.txt"));
				co = parameters.nextInt();
				cr = parameters.nextInt();
				
			//	System.out.println("Company " + co + "  Crime  "+ cr);
				parameters.close();
				
				
				Integer[][][] myData=new Integer[co][cr][5000];
				
				for (int i=0;i<co; i++) {
					for (int j=0;j<cr; j++) {
						Scanner inFile1 = new Scanner(new File("inputFiles/F_"+i+"_"+j+".txt"));
						int k=0;
						while(inFile1.hasNext()){
						        // how can I create array from text read?

						        // find next line
							String  token1 = inFile1.nextLine();
							int token2=Integer.parseInt(token1);
							myData[i][j][k]=token2;
							k++;
						}
					}
			   
				}
				
				
				AbstractIntersectionFinder<E> af=new P1andP2<E>("p1");
				AbstractIntersectionFinder<E> af2=new P1andP2<E>("p2");
				AbstractIntersectionFinder<E> af3=new P3<E>();
				AbstractIntersectionFinder<E> af4=new P4<E>();
				
				//
				String x="0";
				if(args.length>0)x=args[0];
				
				//Verifies that when called class if called in cmd, it runs the wanted class. 
				if (x.equals("1") || x.equals("0")) System.out.println("The Final Set by P1:  "   +af.intersectSets(af.createSets2(myData)).toString());   
				if (x.equals("2") || x.equals("0")) System.out.println("The Final Set by P2:  "   +af2.intersectSets(af.createSets2(myData)).toString());
				if (x.equals("3") || x.equals("0")) System.out.println("The Final Set by P3:  "   +af3.intersectSets(af.createSets2(myData)).toString());
				if (x.equals("4") || x.equals("0")) System.out.println("The Final Set by P4:  "   +af4.intersectSets(af.createSets2(myData)).toString()); 
		  
		 		
		
		
	
		  
	  }
}
