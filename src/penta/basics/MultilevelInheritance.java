package penta.basics;
class Vehicle
{
	void features()
	{
		System.out.println("Engine,\n"
				+ "Accelerator\n, "
				+ "Brakes\n, Wheels\n");
	}
}
class Car extends Vehicle
{
	// By default all vehicle properties are available inside car
	// when car extends Vehicle 
	// Properties means all variables and methods are available
	// without creating an object
	String enginetype="Petrol";
	void carFeatures()
	{
		System.out.println("Engine Type "+enginetype);
		System.out.println();
	}
}
class Maruti800 extends Car
{
	int modelyear=2000;
	
	double price=200000;
	
	void maruticarDetails()
	{
		carFeatures();
		System.out.println("Model Year : "+modelyear);
		System.out.println("Price : "+price);
		System.out.println();
	}
	
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		
		
		Car c= new Car();
		System.out.println("Car- Parent Details");
		c.features();
		c.carFeatures();
		
		Maruti800 m=new Maruti800();
		
		System.out.println("Maruti 800-Details");
		m.maruticarDetails();

	}

}
