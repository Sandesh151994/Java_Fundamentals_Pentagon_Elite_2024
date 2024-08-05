package penta.collections;

import java.util.*;
import java.util.Vector;

public class VectorTest {
	
	public static void main(String[] args) {
		
		Vector<Integer> v1= new Vector<>();
		
		
		v1.addElement(23);//legacy method
		v1.add(45);
		v1.addElement(56);
		System.out.println(v1);
//		v1.removeElementAt(0);//legacy method
		System.out.println(v1);
		
		System.out.println(v1.firstElement());//legacy method
		System.out.println(v1.lastElement());//legacy method
		
		Enumeration<Integer> en=v1.elements();//legacy method
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		System.out.println();

		
		ArrayList<Integer> a=new ArrayList<>();
		
		Collections.addAll(a, 12,34,56,78,90);
		System.out.println(a);
		
		Iterator<Integer> itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
//		a.rem
//		
		
		}

}
