package penta.basics;

public class PreIncrement {

	public static void main(String[] args) {
		
		// pre increment
		int a=5;
		System.out.println(++a);//6
		System.out.println(a);//6
		//pre increment
		int b=2;
		int c=++b;
		System.out.println(c);//3
		System.out.println(b);//3
		
		
		int m=10;
		System.out.println(m++);//11
		System.out.println(m);//10
		
		
		int k=25;
		
		int j=k++;
		System.out.println(k);//26
		System.out.println(j);//26
		
		
		
		int num1=7;
		int num2=num1--;
		
		System.out.println(num1);
		System.out.println(num2);
		
		
		

	}

}
