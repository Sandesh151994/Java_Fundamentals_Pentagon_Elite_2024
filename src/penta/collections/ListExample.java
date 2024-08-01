package penta.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>();
		names.add("Sudeep");
		names.add("Preethi");
		names.add("Pranathi");
		names.add("Puneeth");
		names.add("Rina");
		names.add("Chhaya");
		names.add("Yashaswini");
		names.add("Shreshta");
		names.add("Allu Arjun");
		names.add("Peter Parker");
		names.add("Harry Potter");
		names.add("Bujji");
		names.add("Agasthya");
		names.add("ABC");
		names.add("Rina");
		System.out.println(names);
		System.out.println(names.size());
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		/*
		 * 
		 * for(datatype var_name:list_of_data)
		 * {
		 * 
		 * }
		 */
		System.out.println("With Enhanced for loop");
		for(String n:names)
		{
			System.out.println(n);
		}
		
	}

}
