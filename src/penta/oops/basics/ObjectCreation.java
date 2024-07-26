package penta.oops.basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Demo 
{
	String name="Nitin";
}
public class ObjectCreation implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException  {
		// 1. using new keyword
		
		Demo d=new Demo();
		System.out.println(d);
	//2. using Class.newInstance()
		Demo d1=Demo.class.newInstance();
		System.out.println(d1);
	//3. using clone()
		
		ObjectCreation obj= new ObjectCreation();
		
		System.out.println(obj);
		
		ObjectCreation obj1=(ObjectCreation) obj.clone();
		
		System.out.println(obj1);
		
	//4. newInstance() method of Constructor
		
		Constructor<ObjectCreation> ob=ObjectCreation.class.getConstructor();
		
		ObjectCreation ob1=ob.newInstance();
		
		System.out.println(ob1);
		

	}

}
