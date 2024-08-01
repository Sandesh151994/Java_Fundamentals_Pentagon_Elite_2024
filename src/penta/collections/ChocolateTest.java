package penta.collections;

import java.util.ArrayList;
import java.util.List;

class Chocolate
{
	String name;
	String flavor;
	String toWhom;
	double price;
	public Chocolate(String name, String flavor, String toWhom, double price) {
		super();
		this.name = name;
		this.flavor = flavor;
		this.toWhom = toWhom;
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Name : "+this.name);
		System.out.println("flavor : "+this.flavor);
		System.out.println("To Whom : "+this.toWhom);
		System.out.println("Price : "+this.price);
	}
	
	
}
public class ChocolateTest {

	public static void main(String[] args) {
		
		Chocolate c1=new Chocolate("Kitkat","Choco","Myself",50);
		
		Chocolate c2=new Chocolate("Snickers","Peanuts","Husband",100);
		
		Chocolate c3=new Chocolate("DairyMilk","Silk","Girlfriend",195);
		
		Chocolate c4=new Chocolate("Bounty","Coconut","Disha",99);
		
		List<Chocolate> chocolist=new ArrayList<Chocolate>();
		
		chocolist.add(c1);//0
		chocolist.add(c2);//1
		chocolist.add(c3);//2
		chocolist.add(c4);//3
		
		for(Chocolate c:chocolist)
		{
			c.display();
			System.out.println("===================");
		}
//		chocolist.remove(c4);
//		System.out.println("After removal");
//		for(Chocolate c:chocolist)
//		{
//			c.display();
//			System.out.println("===================");
//		}
		Chocolate c5=new Chocolate("5 star","Choco","Friends",50);
		chocolist.set(3, c5);
		chocolist.set(1,c4);
		
		System.out.println("After update");
		for(Chocolate c:chocolist)
		{
			c.display();
			System.out.println("===================");
		}

	}

}
