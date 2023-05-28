package List_Interface;

public class Stack {

	public static void main(String[] args) {
	
		///>>>>> Stack>>>>>>////
		// 100% increment
		// default capacity====10== initient capacity==10 
		// stack is a Legacy class --v--1.2---
		// imagine as a verical (ex: one by one--- stock boxes ) 
		// Stack-----LIFO ------Queue----FIFO
		/// stack is class which impliment list interface and exteds in the vector class 
	
	
		java.util.Stack<String> st=new java.util.Stack<>();
		st.add("Red");
		st.add("White");
		st.add("Black");
		st.push("Yellow");
		
		st.add(0, "Purpul");
	
//		System.out.println(st);
//		System.out.println(st.contains("Red"));   //true
		
		
		// special methods: push(add), pop(remove), peek(fetch), search---- availble 
		
		System.out.println(st.peek()); //Black // cann't remove
		System.out.println(st);
//		System.out.println(st.pop());
//		System.out.println(st);      //[Purpul, Red, White]  element remove
		System.out.println(st.search("Black"));			
		System.out.println(st.indexOf("Black"));		
		
		
	
	
	
	
	
	}

}
