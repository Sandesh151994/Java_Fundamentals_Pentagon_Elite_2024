package penta.basics;

class Demo
{
	
	static void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition 1: "+c);
	}
	
	static int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	char getChar()
	{
		return 'B';
	}
	
	String getString()
	{
		return "Yeshwanth";
	}
	
	Demo getObject()
	{
		return new Demo();
	}
}

public class Methods {

	public static void main(String[] args) {
		
		
		Demo.add(10,20);
		
		System.out.println(Demo.sum(30,40));

	}

}
