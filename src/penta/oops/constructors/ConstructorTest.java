package penta.oops.constructors;

public class ConstructorTest {
	
	int num=10;
	ConstructorTest()
	{
		//System.out.println("Inside No Arg Constructor");
	}
	
	ConstructorTest(int n)
	{
		num=n;
		
		System.out.println("Inside Parameterized Const"+num);
	}
	
	public static void main(String[] args) {
		
		ConstructorTest c1=new ConstructorTest();
		ConstructorTest c=new ConstructorTest(c1.num);
	
	
	}

}
