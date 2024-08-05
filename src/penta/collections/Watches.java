package penta.collections;

public class Watches {
	
	String brand;
	String type;
	double price;
	Watches(String brand,String type,double price)
	{
		this.brand=brand;
		this.type=type;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Watches [brand=" + brand + ", type=" + type + ", price=" + price + "]\n";
	}
	
}
