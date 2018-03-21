package setIntersectionFinders;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import dataGenerator.DataGenerator;
import interfaces.IntersectionFinder;
import interfaces.MySet;
import mySetImplementations.Set1;
import mySetImplementations.Set2;

public class  P1andP2<E> extends AbstractIntersectionFinder<E>{
	  private Set1<E> element1s; 
	  private Set2<E> element2s; 
	  private String name;
	  private int co;
	  private int cr;

	public P1andP2(String name) {
		super(name);
		
	
		
		// TODO Auto-generated constructor stub
	}
	public P1andP2() {
		element1s=new Set1<E>();
	}
	
// This method return an array of sets. Each element of this array holds a set of the values 
	//provided by all telephone companies for that particular crime.
	@Override
	
	@SuppressWarnings("unchecked")
//############################  This one #############################	
	public MySet<E>[] createSets(Integer[][][] rawData) {
		//Set1<E> myT=new Set1<E>();
//		MySet[] mySetArray =new MySet[cr];	
		co=rawData.length;//company
		cr=rawData[0].length;//crime
		Integer size3, xx;
		
	//	if (this.getName()=="P2") {
	//		HashMap<E, E> p2= new HashMap<E, E>();
			
	//	}
			

//		ArrayList<Integer>[] myT= new ArrayList[cr];
		MySet[] myT =new MySet[cr];		
		for (int i=0; i<cr; ++i) {
			myT[i] = new Set1<E>();			
			for (int j=0;j<co;++j) {//each company
				size3=rawData[j][i].length;
				for(int k=0;k<size3;k++) {
					xx=rawData[j][i][k];
					if(xx==null)break;
					//System.out.println(" i "+i+" j "+j+" k "+k+ " xx "+xx+" cr "+cr+" co "+co+" size3 "+size3);
					//see if xx is found in myT[i] yes ignore no then add to arraylist
					if (!myT[i].contains(xx)) {
						myT[i].add(xx);
						
					}
				}
	
			}
		}
		
	//	dataSet[i][j] = (Integer[]) set.toArray(new Integer[0]); 
		//it returns a array of elements of type set.
		return  myT;
	}
	//####################################  Modify this one ######################################################
	
	public MySet<E>[] createSets2(Integer[][][] rawData) {
		co=rawData.length;//company
		cr=rawData[0].length;//crime
		Integer size3, xx;		
	//	if (this.getName()=="P2") {
	//		HashMap<E, E> p2= new HashMap<E, E>();
			
	//	}
			
		MySet[] myT =new MySet[cr];		
		for (int i=0; i<cr; ++i) {
			if (this.getName()=="p1") 	myT[i] = new Set1<E>();	
			else myT[i] = new Set2<E>();		
			
				
			for (int j=0;j<co;++j) {//each company
				size3=rawData[j][i].length;
				for(int k=0;k<size3;k++) {
					xx=rawData[j][i][k];
					if(xx==null)break;
					//System.out.println(" i "+i+" j "+j+" k "+k+ " xx "+xx+" cr "+cr+" co "+co+" size3 "+size3);
					//see if xx is found in myT[i] yes ignore no then add to arraylist
					if (!myT[i].contains(xx)) {
						myT[i].add(xx);
						
					}
				}
	
			}
		}
		
		return  myT;
	}
	//################# Modify This One #########################################
	public MySet<E> intersectSets(MySet<E>[] myT){
		
		MySet<E> finalT;
		if (this.getName()=="p1") { finalT =new Set1<E>();}
		else {  finalT =new Set2<E>();}
		
		for (E e:myT[0]) {
			finalT.add(e);
//			System.out.println("myT "+e.toString());
		
		}

		for (int i=1;i<myT.length;i++) {

			Iterator<E> finalTiterator = finalT.iterator();
			E e;  
			while (finalTiterator.hasNext()) {
				e=finalTiterator.next();
				
			//	System.out.println("myT "+i+" "+e.toString());
				if (!myT[i].contains(e)) {
				
					
				//		System.out.println("Remove "+i+" "+e.toString());
					finalTiterator.remove();
				}				
			}
					
		}			
		
		return finalT;
	}		

		//##########################################################
	//	public ArrayList<Integer> intersectMySets(ArrayList<Integer>[] myT){
	//		ArrayList<Integer> finalT = new ArrayList<Integer>();
	//		int n=myT.length;
	//		finalT=(ArrayList<Integer>) myT[0].clone();
		//	System.out.println("this is finalT "+finalT.toString());
	//		for(int i=1;i<n;i++) {
	//			for (Integer e: myT[0]) {
	//				System.out.println("e "+e);
	//				if (!myT[i].contains(e)) {
	//					System.out.println("remove "+e);
					
	//					finalT.remove(e);
	//				}
				//	while (finalT.iterator().hasNext()) {
			//		Integer xx=finalT.iterator().next();
			//		System.out.println("next "+finalT.iterator().next());
			//		if (!myT[i].contains(xx)) {
			//			finalT.remove(xx);
		//		}
					
					//System.out.println("this is xx finalT "+xx+" "+finalT.toString());
					//System.out.print("xx "+xx);
					
		//	}
		//	System.out.println(" ");
			
		//	System.out.println("this is final finalT "+finalT.toString());
			
		//	System.out.println(" ");
					
		//	return finalT;
			
	//	}
		
/**	
	public MySet<E> intersectSets2(MySet<E>[] t){
		int cr=t.length;
		MySet[] mySetArray =new MySet[cr];		
		for (int i=0; i<cr; ++i) {
			mySetArray[i] = new Set1<E>();			
		}
		//String p1 = null,p2 = null;
		//if (this.getName()==p1){
		if (1==1){
			Set1<E> T= new Set1<E>();
			try {
				T=(Set1<E>) t[0].clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i=1;i<t.length;i++) {
				for(int j=0;j<t[i].size();j++) {
					if(!t[j].contains((E) T)){
						T.remove((E) t[j]);
					}
					
				}
				
			}
			
			
			return T;
	//	}
		if(1==0) {
			//	if(this.getName()==p2) {
	//			Set2<E> T= new Set2<E>();	
				try {
					//T=(Set2<E>) t[0].clone();
				} catch (CloneNotSupportedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for(int i=1;i<t.length;i++) {
					for(int j=0;j<t[i].size();j++) {
						if(!t[j].contains((E) T)){
							T.remove((E) t[j]);
						}
						
					}
					
				}
				
				
				return T;
		//	}
		
	
		
	
		return T;	
//		}
	
	//	MySet<E> t=new MySet<E>[]();
	//	T.add(e);
	//	ArrayList<Integer>[] baseT = (ArrayList<Integer>[]) t.toArray(new Integer[0]);
	
		
		
**/	
	private void printArray(MySet<E> mySet) {
		for (int i=0; i<mySet.size(); i++) 
			System.out.print(mySet.toArray() + "  "); 
		System.out.println(); 
	}

	public void printIntersection() { 
		System.out.println("intersection set is: " ); 
		for (int i=0; i<this.element1s.size(); i++)
				System.out.print("Set["+i+"] = "); 
				printArray( this.intersectSets()); 
			}

	public String getName() { 
		
		return name;
		
	}
	

}
