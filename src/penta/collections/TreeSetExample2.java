package penta.collections;

import java.util.*;
import java.util.TreeSet;

class Flowers implements Comparable<Flowers>
{
	String name;
	int price;
	public Flowers(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Flowers [name=" + name + ", price=" + price + "]\n";
	}
	@Override
	public int compareTo(Flowers f) {
		
		return this.name.compareTo(f.name);
	}	
}
public class TreeSetExample2 {

	public static void main(String[] args) {
		
		Flowers f1= new Flowers("Rose",10);
		
		Flowers f2= new Flowers("Sunflower",100);
		
		Flowers f3=new Flowers("Jasmine",200);
	
		Flowers f4= new Flowers("Hibiscus",11);
		
		List<Flowers> flowerset=new ArrayList<>();
		
		flowerset.add(f1);
		flowerset.add(f2);
		flowerset.add(f3);
		flowerset.add(f4);
		
		Collections.sort(flowerset);
		
		System.out.println(flowerset);
		
		
//		String str1="Naveen";
//		String str2="Narendra";
//		
//		System.out.println(str1.compareTo(str2));
	}

}
