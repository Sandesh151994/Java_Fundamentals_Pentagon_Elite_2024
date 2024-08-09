package penta.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

class Food
{
	String type;
	String foodname;
	float price;
	public Food(String type, String foodname, float price) {
		super();
		this.type = type;
		this.foodname = foodname;
		this.price = price;
	}
	
	void disp()
	{
		
		System.out.println(this.type+"\t\t|"+this.foodname+"\t\t|"
				
				+this.price+"\t\t|");
		System.out.println("------------------------------------------------------------------------");
		
	}
	
}

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		
		Food f1= new Food("Non-Veg","Tandoori",300);
		Food f2= new Food("Non-Veg","Chicken Tikka",350);
		Food f3= new Food("Veg","P buttermasala",400);
		Food f4= new Food("Non-Veg","Kushka-Kabab",300);
		LinkedHashSet<Food> lhs=new LinkedHashSet<>();
		
		Collections.addAll(lhs, f1,f2,f3,f4,f2,null);
		
		
		Iterator<Food> itr=lhs.iterator();
		
		System.out.println("FoodType"+"\t|Food Name\t\t|Food Price\t|");
		
		System.out.println("------------------------------------------------------------------------");
		while(itr.hasNext())
		{
			Food food=itr.next();
			
			food.disp();
			
		}
	}

}
