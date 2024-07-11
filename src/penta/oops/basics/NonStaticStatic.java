package penta.oops.basics;

import java.util.Scanner;

public class NonStaticStatic {
	
	
	int num;// Declaration
	
	int num1;
	static void print()
	{
		NonStaticStatic st= new NonStaticStatic();
		st.num=20;// Initialization
		System.out.println("Static method");
	}
	void disp()
	{
//		num=40;

		System.out.println("Value of Num1 is : "+num1);
//		NonStaticStatic.print();
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		NonStaticStatic ns=new NonStaticStatic();
		System.out.println("Enter the value for num1");
		ns.num1=sc.nextInt();
		ns.disp();
		
		
		
		

	}

}
