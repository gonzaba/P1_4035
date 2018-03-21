package p1MainClasses;

import dataGenerator.DataReader;
import interfaces.MySet;
import mySetImplementations.Set1;
import mySetImplementations.Set2;
import setIntersectionFinders.AbstractIntersectionFinder;

/**
 * 
 * @author Barbara P. Gonzalez 802-14-2976
 *
 */

public class P1andP2<E> extends AbstractIntersectionFinder{

	public P1andP2(String name) {
		super(name);
	}

	@Override
	public MySet intersectSets(MySet[] t) {
		
		//REMEMBER TO CHNGE THIS
		MySet<E> result = null;
		
		return result;
	}

	
	Set1 set1 = new Set1<Object>();
	Set2 set2 = new Set2<Object>();
	
}
