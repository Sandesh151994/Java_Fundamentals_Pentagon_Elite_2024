package penta.basics;

public class UnaryOpAssigment {

	public static void main(String[] args) {
		
		
		int a=4,b=3;
		
		System.out.println(b++);
		System.out.println(b);
		System.out.println(++b);
		int c=(a++)+(b++)+(++b);
		int d=(++c)+(a++)+(b++);
		
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		System.out.println("C : "+c);
		System.out.println("D : "+d);
		

	}

}
