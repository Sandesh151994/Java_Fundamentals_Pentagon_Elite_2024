package penta.collections;

import java.util.PriorityQueue;

public class PriorityQueueEx2 {

	public static void main(String[] args) {
		
		
		PriorityQueue<String>  places=new PriorityQueue<>();
		
		places.add("Srishailam");
		places.add("Goa");
		places.add("Tirupati");
		places.add("Koramangala");
		places.add("Chamundi Hill");
		places.add("Nandi Hill");
		System.out.println("Removing");
		
		System.out.println(places.poll());
		System.out.println(places.poll());
		System.out.println(places.poll());
		System.out.println(places.poll());
		System.out.println(places.poll());
		System.out.println(places.poll());
		

	}

}
