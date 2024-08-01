package penta.collections;

class StoreData<T>
{
	T data;
	void add(T data)
	{
		this.data=data;
	}
}
public class Generics {

	public static void main(String[] args) {
		
		StoreData<String> st=new StoreData<String>();
		st.add("ABC");
		System.out.println(st.data);
		
		StoreData<Integer> i=new StoreData<Integer>();
		i.add(123);
		System.out.println(i.data);
		
		

	}

}
