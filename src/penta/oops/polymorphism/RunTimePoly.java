package penta.oops.polymorphism;

class House
{
	void build()
	{
		System.out.println("Building normal house with 2bhk without stairs");
	}
}
class DuplexHouse extends House
{
	@Override
	void build()
	{
		System.out.println("Implementing old house with new duplex house with extra 3 bedrooms with"
				+ "with stairs ");
	}
}
public class RunTimePoly {

	public static void main(String[] args) {

		House h=new House();
		h.build();

		DuplexHouse dh=new DuplexHouse();
		dh.build();
	}

	public class Main { 
		public static void main(String[] args) 
		{ 
			int result = sum(10); 
			System.out.println(result); 
		} 
		public static int sum(int k) 
		{
			if (k > 0)
			{ 
				return k + sum(k - 1);
			}
			else
			{
				return 0;
			}
		}
	}


}
