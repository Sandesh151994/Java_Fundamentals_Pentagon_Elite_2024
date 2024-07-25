package penta.strings;

public class StringSplit {

	public static void main(String[] args) {
		
		String str="If you dream it you can do it";
		
		String strarr[]=str.split(" ");
		
		// if-0,you-1.dream-2,it-3,you-4,can-5,do-6,it-7
		
		for (int i = 0; i < strarr.length; i++) {
			
			System.out.println(strarr[i]+" "+i);
			
		}
		

	}

}
