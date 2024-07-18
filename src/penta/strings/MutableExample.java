package penta.strings;

public class MutableExample {

	public static void main(String[] args) {
		
		
		StringBuffer buf= new StringBuffer("Java");
		
		buf.append(" Programming");
		
		System.out.println(buf);
		
		
		StringBuilder builder=new StringBuilder("Hello");
		
		builder.append(" World");
		
		System.out.println(builder);
		
		
		String first=new String("Hello").intern();
		
		
		String second="Hello";
		System.out.println(first==second);
		
		
		

	}

}
