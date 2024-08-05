package penta.collections;

public class Drinks {

	
	String type;
	String brand;
	double quantity;
	double price;
	public Drinks(String type, String brand, double quantity, double price) 
	{
		this.type = type;
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return "Drinks Type : "+this.type+"\nBrand :"+this.brand+
				"\nQuantity : "+this.quantity+"\nPrice : "+this.price;
	}
	
	
}
