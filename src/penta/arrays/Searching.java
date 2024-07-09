package penta.arrays;


import java.util.Scanner;

public class Searching {
	
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
	
		int key=20;
	int low=0,high=arr.length-1;
	 // get index of mid element
    int mid = low + (high - low) / 2;
	// Repeat until the pointers low and high meet each other
	    while (low <= high) {
	
	     
	
	      // if element to be searched is the mid element
	      if (arr[mid] == key)
	       
	    	  System.out.println(key+ " Found at : "+ mid);
	      else
	      if (arr[mid] < key)
	        low = mid + 1;
	
	      // if element is greater than mid element
	      // search only the right side of mid
	      else
	        high = mid - 1;
	    }
	
	    mid=(low+high)/2;
	    
	  }
	
}
	

