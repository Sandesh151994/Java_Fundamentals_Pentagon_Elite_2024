package penta.strings;
import java.util.Scanner;

public class StringExample1 {

	public static void main(String[] args) {
		

		String str="Hello";//H-0,e-1,l-2,l-3,0-4
		System.out.println(str);
		String str1=str.concat(" World");
		System.out.println(str);
		System.out.println(str.charAt(3));
		
		String str2="hello";
		System.out.println(str==str2);
		
		for (int i = 0; i < str.length(); i++) {
			
			System.out.println(str.charAt(i));
			
		}
		
		String str4=new String("Hello");
		System.out.println(str==str4);

	}

}
