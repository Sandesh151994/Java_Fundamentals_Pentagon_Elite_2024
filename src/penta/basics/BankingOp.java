package penta.basics;

import java.util.Scanner;

public class BankingOp {

	public static void main(String[] args) {
		
		int balance=1000;
		Scanner sc= new Scanner(System.in);
		int depamount,withdrawlamount;
		
		while(true)
		{
		System.out.println("Choose Options");
		System.out.println("1. Deposite\n"
				+ "2. Withdrawl\n"
				+ "3. Balance Checking\n"
				+ "4. Exit");
		
		int option=sc.nextInt();
		
		switch(option)
		{
			
		case 1: 
			System.out.println("Entert the amount to deposite");
			depamount=sc.nextInt();
			balance=balance+depamount;
			System.out.println("Balance after deposite : "+balance);
			break;
			
		case 2:
			System.out.println("Entert the amount to withdrawl");
			withdrawlamount=sc.nextInt();
			balance=balance-withdrawlamount;
			System.out.println("Balance after withdrawl : "+balance);
			break;
			
		case 3:
			System.out.println("Balance is :"+balance);
			break;
		case 4:
			System.out.println("Thank you for banking");
			return;
		}
		
		}
		
		

	}

}
