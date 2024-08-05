package penta.collections;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		
		Stack<Integer> st=new Stack<>();
		
		st.push(12);
		st.push(45);
		st.push(36);
		st.push(78);
		st.push(11);
		System.out.println(st);
		System.out.println("Poping elements");
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		

	}

}
