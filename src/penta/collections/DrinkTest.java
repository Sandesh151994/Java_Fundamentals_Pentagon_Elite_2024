package penta.collections;

import java.util.*;
import java.util.Collections;

public class DrinkTest {

	public static void main(String[] args) {


		Drinks d1= new Drinks("SoftDrinks","CocoCola",2,120);

		Drinks d2= new Drinks("HotDrinks","Black&WHite",0.75,2400);

		Drinks d3=new Drinks("SoftDrinks","Slice",.50,50);

		Drinks d4=new Drinks("Beer","Tuborg",.650,190);

		Drinks d5=new Drinks("Vodka","Magic Moment-Green Apple",.750,1600);


		//	System.out.println(d1);

		ArrayList<Drinks> drinkslist=new ArrayList<>();

		Collections.addAll(drinkslist, d1,d2,d3,d4,d5);

		//	for(Drinks d:drinkslist)
		//	{
		//		System.out.println(d);
		//		System.out.println("===========================");
		//	}
		//	
		//	drinkslist.remove(3);
		//	System.out.println();
		//	System.out.println("After Removal");
		//	
		//	for(Drinks d:drinkslist)
		//	{
		//		System.out.println(d);
		//		System.out.println("===========================");
		//	}
		//	
		//	drinkslist.set(0, d4);
		//	
		//	
		//	System.out.println();
		//	System.out.println("After Replacing");
		//	
		//	for(Drinks d:drinkslist)
		//	{
		//		System.out.println(d);
		//		System.out.println("===========================");
		//	}
		//	
		//	System.out.println("Getting single object from list using get method");
//		System.out.println(drinkslist.get(1));

		System.out.println("Using normal for Loop");
		
		for (int i = 0; i < drinkslist.size(); i++) {
			
			System.out.println(drinkslist.get(i));
			System.out.println();
			
		}
	}


}
