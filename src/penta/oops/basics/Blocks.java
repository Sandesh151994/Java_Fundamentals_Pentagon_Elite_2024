package penta.oops.basics;

public class Blocks {
	
	
	static int num1;
	int num2;
	static
	{
		Blocks b= new Blocks();
		b.num2=50;
		num1=20;
		System.out.println("Im inside static block "+num1);
	}
	
	//instance block/non static
	{
		num2=40;
		System.out.println("Im inside Instance Block1"+num2);
	}
	{
		System.out.println("Im inside Instance Block2");
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("Inside Main Method");
		
		Blocks b= new Blocks();
		
	

	}

}
