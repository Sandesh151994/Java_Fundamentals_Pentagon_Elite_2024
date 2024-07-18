package penta.oops.constructors;

class Address
{
	String city;
	String state;
	String country;

	Address(String city, String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
}
class Student1
{
	String name;
	int marks;
	Address add;

	Student1(String name,int marks,Address add)
	{
		this.name=name;
		this.marks=marks;
		this.add=add;
	}
	void disp()
	{

		System.out.println("Student name : "+this.name);
		System.out.println("Student marks : "+this.marks);
		System.out.println("Student Address : ");
		System.out.println("====================");
		System.out.println("Student City : "+this.add.city);
		System.out.println("Student State : "+this.add.state);

	}
}

public class Aggregation {

	public static void main(String[] args) {

		Address address=new Address("Kollegala","Karnataka","Country");

		Student1 std1=new Student1("Ranganna",500,address);
		
		std1.disp();









	}

}
