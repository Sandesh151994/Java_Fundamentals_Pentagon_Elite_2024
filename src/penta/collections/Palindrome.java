package penta.collections;

public class Palindrome {

	public static void main(String[] args) {
		
		
		int n=121;
		int temp=n;
		int rem=0,rev=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		System.out.println("Rev Number "+rev);
		
		if(temp==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
