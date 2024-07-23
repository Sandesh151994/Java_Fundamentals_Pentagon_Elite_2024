package penta.oops.basics;

class Outer

{
	int num;
	

	 void print()
	
	{
		num=20;
		
		System.out.println("Inside Outer Class");
	}
	class Inner
	
	{
		
		void disp()
		{
			System.out.println("Inside Inner class");
		}
		
		public static void main(String[] args) {
			
			System.out.println("Inside Inner class main method");
		}
	}



	public static void main(String[] args) {
		
		Outer out=new Outer();
		
		out.print();
		
		Outer.Inner inn=out.new Inner();
		
		inn.disp();
		
		
		
	}

}
