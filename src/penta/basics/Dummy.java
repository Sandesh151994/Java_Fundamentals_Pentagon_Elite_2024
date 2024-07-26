package penta.basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Dummy implements Cloneable   
{

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException, NoSuchMethodException, SecurityException {
		
		
		Dummy d=Dummy.class.newInstance();
		System.out.println(d);
		
		Dummy d1=new Dummy();
		
		Dummy d2=(Dummy) d1.clone();
		System.out.println(d2);
		Constructor<Dummy> d3=Dummy.class.getConstructor();
		
		try {
			Dummy d4=d3.newInstance();
			System.out.println(d4);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
