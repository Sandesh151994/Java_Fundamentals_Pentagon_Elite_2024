package penta.oops.abstraction;

interface FlightBooking
{
//	abstract void checkAvailability();
	void checkAvailability();
	static void disp()
	{
		System.out.println("Checking flights availibility");
	}
	default void print()
	{
		System.out.println(" HEllo from default");
	}
	

}

class AirAsia implements FlightBooking
{
	@Override
	public void checkAvailability()
	{
		System.out.println("AirAsia FLights are available on 18-07-2024");
	}
}
class Indigo implements FlightBooking
{
	@Override
	public void checkAvailability()
	{
		System.out.println("Indigo FLights are available on 18-07-2024");
	}

}

public class InterfaceTest {
	
	public static void main(String[] args) {
		
		AirAsia asia=new AirAsia();
		asia.checkAvailability();
		FlightBooking.disp();
		asia.print();
		Indigo indigo=new Indigo();
		indigo.checkAvailability();
	}

}
