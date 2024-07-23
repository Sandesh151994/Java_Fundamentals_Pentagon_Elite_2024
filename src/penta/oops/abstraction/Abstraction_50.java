package penta.oops.abstraction;

abstract class Vehicle
{
	abstract void start();
	abstract void stop();
}
abstract class  Car extends Vehicle
{

	@Override
	void start() {
		
		System.out.println("Startinig Car");
		
	}
	
}
class  Car1 extends Car
{

	@Override
	void stop() {
		
		System.out.println("Startinig Car");
		
	}
	
}
public class Abstraction_50 {

	public static void main(String[] args) {
		
		Car1 car= new Car1();

	}

}
