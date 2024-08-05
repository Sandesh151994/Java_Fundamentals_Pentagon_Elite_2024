package penta.collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		
		Watches w1=new Watches("NoiseFit","Andriod",3000);
		Watches w2=new Watches("Rolex","Analog",200000);
		Watches w3=new Watches("Bolt","Andriod",1999);
		Watches w4=new Watches("Sonata","Analog",5000);
		Watches w5=new Watches("Apple","IWatch",18000);
		
		LinkedList<Watches> watchlist=new LinkedList<Watches>();
		
		Collections.addAll(watchlist, w1,w2,w3,w4,w5);
		System.out.println(watchlist);
		System.out.println("==========");
		System.out.println("Andriod watches are");
		for(Watches w:watchlist)
		{
			if(w.type.equals("Andriod"))
			{
				System.out.println(w);
			}
		}
		watchlist.removeAll(watchlist);
		System.out.println(watchlist);
		

	}

}
