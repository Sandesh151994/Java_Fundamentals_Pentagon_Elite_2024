package penta.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample{

	public static void main(String[] args) {
		
		TreeSet<Integer> ts=
				new TreeSet<Integer>();
		ts.add(45);
		
		ts.add(12);
		
		ts.add(43);
		
		ts.add(21);
		
		ts.add(89);
		
		ts.add(5);
		ts.add(4);
		
		System.out.println(ts);
		
//		ts.add(null);
		
		System.out.println("returns least greater or equal element : "+
		ts.ceiling(23));
		
		System.out.println("returns least lesser or equal element :"+ts.floor(7));
		
		
//		Iterator<Integer> itr=ts.descendingIterator();
//		System.out.println(ts);
		
//		while(itr.hasNext())
//		{
//			if(ts.contains(5))
//			System.out.print(ts.remove(5));
//		}
		
		for(Integer i:ts)
		{
			if(ts.contains(5))
			ts.remove(5);
		}
//		System.out.println(ts);
//		System.out.println(ts);
		

	}

}
