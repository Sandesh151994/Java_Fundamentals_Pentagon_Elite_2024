package penta.strings;

public class StringMethods2 {

	public static void main(String[] args) {
		
		String str1="Hello World, Welcome to java";
		String str2="Harsha";
		
		String str3=new String("Harshitha");
		
		
		System.out.println(str1==str2);
		
		System.out.println(str3==str1);
		
		System.out.println(str1.equals(str3));
		
		System.out.println(str1.equalsIgnoreCase(str3));
		
		// character sequence in a given string
		
		System.out.println(str1.contains("come to java"));
		
		System.out.println(str3.compareTo(str2));
		
		System.out.println(str1.trim());
		
		System.out.println("Substring==========");
		
		System.out.println(str1.substring(6,20));
		
		
		String newstr=String.join(" ", "Welcome","to","Pentagonspace");
		
		System.out.println(newstr);
		
		String upper="POORNIMA";
		System.out.println(upper.toLowerCase());
		String lower="yashwanth";
		
		System.out.println(lower.toUpperCase());
		
	}
}
