package penta.oops.abstraction;

interface Parent1
{
	void property();
}
interface Parent2
{
	void property();
}
class Child implements Parent1,Parent2
{

	@Override
	public void property() {
		
		
		System.out.println("Purchasing 4 acres of land");
		
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		
		Child c= new Child();
		c.property();
	}

}
