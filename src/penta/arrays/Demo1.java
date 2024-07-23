package penta.arrays;

public class Demo1 {

	public static void main(String[] args) {
		
		
		int arr[]= {10,30,40,50,60};
		
		for (int i = 0; i < arr.length; i++) {
			
			
			System.out.println(arr[i]+" index : "+i);
			
		}
		// 60 50 40 30 10
		// 4   3  2  1  0
		
		System.out.println(arr[4]);
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]+" index  : "+i);
		}
		

	}

}
