package penta.oops.basics;

public class Variables {
	
	int b=40;// instance variable
	
	static int c=50;
	
	

	public static void main(String[] args) 
	{
		int a=20; // local variables
		System.out.println("Local Variable "+a);
		
		Variables v=new Variables();
		System.out.println("Instance Variable "+v.b);
		
		System.out.println(c);
		
		System.out.println(" Static Variables "+Variables.c);
		
		
		System.out.println(55%2);
	}
	
	
	
	

}
