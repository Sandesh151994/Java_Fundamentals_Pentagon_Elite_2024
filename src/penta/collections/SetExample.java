package penta.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		
		Set<String> set=new HashSet<>();
		set.add("Ashika");
		set.add("Nidhi");
		set.add("Appu");
		set.add("Yesh");
		set.add("Stark");
		set.add("Anamika");
		set.add("Medha");
		set.add("Chirayu");
		set.add("Harshika");
		set.add("Varshitha");
		set.add("Pragna");
		set.add("Ashika");
		set.add(null);
		
		for(String name:set)
		{
			System.out.println(name);
		}
		System.out.println(set.remove("ASh"));
		System.out.println();
		for(String name:set)
		{
			System.out.println(name);
		}
		
		// to check whether the element is present inside set or not
		System.out.println();
		System.out.println(set.contains("Naveen"));
		
		System.out.println();
		
		List<Integer> list=List.of(12, 34, 21, 12, 45,34);
		System.out.println(list);
		
		Set<Integer> set1=new HashSet<>(list);
		
		System.out.println("Set ");
		System.out.println(set1);
		
		
		
		
	}

}
