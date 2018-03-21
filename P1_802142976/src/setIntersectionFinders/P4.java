package setIntersectionFinders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import interfaces.MySet;
import mySetImplementations.Set2;


/**
 * 
 * @author Bárbara P. González Rivera - 802-14-2976
 * @author Ramineh Lopez - 402-12-3657
 *
 */

public class P4<E> extends AbstractIntersectionFinder<E>{

	public P4(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public P4() {
		
	}	// TODO Auto-generated constructor stub
	
	@Override
	public MySet<E> intersectSets(MySet<E>[] t) {
		
		MySet<E> finalT=new Set2<E>();
		int cr=t.length;
		
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		ArrayList<Integer> allElements=new ArrayList<Integer>();
		for (int i=0; i<cr; i++) {
			
			for (E e: t[i]) {
				allElements.add( (Integer) e);
				
			}
		}
		for (Integer e: allElements) {
			Integer c=map.getOrDefault(e, 0);
			map.put(e, c+1);
			
		}
		for (Entry<Integer, Integer> entry: map.entrySet() ) {
			if (entry.getValue()==cr) {
				finalT.add((E) entry.getKey());
			}

		}
			
		
		
		
		
		
		return finalT;
	}

}
