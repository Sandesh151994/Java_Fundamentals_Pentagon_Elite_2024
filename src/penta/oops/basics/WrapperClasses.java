package penta.oops.basics;

public class WrapperClasses {

	public static void main(String[] args) {
		
		
		int a=40;
		
		Integer b=60;
		Integer c=new Integer(50);
		
		int num1=100;
		//Autoboxing->primitive to wrapper
		Integer num2=num1;
		
		Integer num3=Integer.valueOf(num1);
		
		//Unboxing -> wrapper to primitive
		
		
		Integer num4=1000;
		//implicit way
		int num5=num4;
		//explicitly converting from wrapper to primitive
		int num6=num4.intValue();
		
	}

}
