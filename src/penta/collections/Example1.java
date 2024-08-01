package penta.collections;

import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		// Without using generics
		List list=new ArrayList();
		list.add("String");//0
		list.add(123);//1
		list.add(new int[] {12,34,56});//2
		list.add('C');//3
		System.out.println(list);//4
		
		int arr[]=(int[]) list.get(2);
		String str=(String) list.get(0);
		
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
		List<Integer> lst=new ArrayList<Integer>();
		
		lst.add(12);
		lst.add(23);
		lst.add(45);
		lst.add(67);
		System.out.println(lst);

	}

}
