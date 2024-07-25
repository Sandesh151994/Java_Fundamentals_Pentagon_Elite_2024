package penta.oops.constructors;

class Parent
{
	String pname;
	int parent_age;
	Parent(String pname,int parent_age)
	{
		this.pname=pname;
		this.parent_age=parent_age;
		System.out.println("Parent Calling");
	}
}
class Child extends Parent
{

	String cname;
	
	Child(String cname,String pname, int parent_age) {
		super(pname, parent_age);
		
		this.cname=cname;
	}
	
	void disp()
	{
		System.out.println("Parent name : "+pname);
		System.out.println("Parent Age : "+parent_age);
		System.out.println("Child Name :"+cname);

	}


	
}
public class ChainingWithSuper {

	public static void main(String[] args) {
		
		
		Child c= new Child("Poornima","pumkin",18);
		c.disp();

	}

}
