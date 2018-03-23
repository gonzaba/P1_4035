package setIntersectionFinders;

import interfaces.MySet;
import mySetImplementations.Set2;
import java.util.ArrayList;

/**
 * 
 * @author Bárbara P. González Rivera - 802-14-2976
 * @author Ramineh Lopez - 402-12-3657
 *
 */

public class P3<E> extends AbstractIntersectionFinder<E>  {
	
	private Set2<E> element1s; 
	private String name;
	 
	public P3(String name) {
		super(name);
	}
	
	public P3() {
		element1s=new Set2<E>();
	}
	
	

	@SuppressWarnings("unchecked")
	public MySet<E> intersectSets(MySet<E>[] t) {
		MySet<E> finalT=new Set2<E>();
		
		int cr=t.length;
	
		ArrayList<Integer> allElements=new ArrayList<Integer>();
		for (int i=0; i<cr; i++) {
			
			for (E e: t[i]) {
				allElements.add( (Integer) e);
			}
		}
		allElements.sort(null);
		Integer e = allElements.get(0);
		int c=1;
		for (int i=1; i<allElements.size(); i++) {
			if (i<allElements.size() && allElements.get(i).equals(e)) {
				c++;	
			}
			
			else {
				if (c==cr) {
					finalT.add((E) e);
				}
				
				e= allElements.get(i);
				c=1;									
				
			
			}
		
		}
		
		return finalT;
	}

}