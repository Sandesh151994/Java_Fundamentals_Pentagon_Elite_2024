package penta.oops.composition;
class Heart
{
	void pump()
	{
		System.out.println("Heart is pumping!, Human is alive");
	}
}

class Human
{
	String gender="Female";
	 Heart h;
	Human()
	{
		h= new Heart();
	}
}

public class CompositonTest {

	public static void main(String[] args) {
		
		Human human=new Human();
		System.out.println(" Gender is : "+human.gender);
		human.h.pump();
		
		
	}

}
