package penta.basics;

class GrandParent
{
	String name="Gandhiiji";
	void land()
	{
		System.out.println("Having 10 acres of Land");
	}
	
	
}
// From Father to Son Single-Level
class Father extends GrandParent
{
	String pname="Mukesh";
	 void house()
	{
	
		System.out.println("Having 3BHK Flat");
		System.out.println("Grand Father Name is : "+name);
		
	}
}
// super is used differentiate child and parent properties if they have
// same name
class Son extends Father
{
	String name="Anant Ambani";
	void car()
	{
		System.out.println("Having Car");
		System.out.println("Son Name is : "+name);
		System.out.println("Father Name is : "+super.name);
		System.out.println("Grand Father Name is : "+super.pname);
		
		
		
	}
}
public class SingleLevel {

	public static void main(String[] args) {
		
		Son s= new Son();
		
		s.land();// Property Of GrandParent
		s.house();// Property Of Father
		s.car();// Own Property
		

	}

}
