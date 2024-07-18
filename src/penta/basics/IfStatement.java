package penta.basics;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter age :");
		int age=sc.nextInt();//20
		
		System.out.println("Age is "+age);
		
		if(age>=18)
		{
			System.out.println("Eligible for voting!");
		}
		
		else
		{
			System.out.println("Not Eligible");
		}
		
	}

}
