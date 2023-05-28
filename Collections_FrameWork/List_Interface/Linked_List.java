package List_Interface;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Linked_List {

	public static void main(String[] args) {
		
		// LinkedList/////
	
//		List<Integer>ll=new LinkedList<>();  		// it is posible to implement of Queue-------No
//		Queue<Integer>ql=new LinkedList<>();	 // it is posible to implement of Queue-------No  
//		Deque<Integer>dl=new LinkedList<>();   // it is posible to implement of Queue-------Yes Linked list Implement Deque interface 	
																		// Deque interface  implement Queue interface 
		
		
		LinkedList<String>ll=new LinkedList<>();
		
		
		ll.add("Y1");
		ll.add("R1");
		ll.add("D1");
		ll.add("T1");
		ll.add(1,"U1");
		
		ArrayList<String>al=new ArrayList();
		al.add("S1");
		al.add("P1");
		
		ll.addAll(al);
		System.out.println(ll);		//       [Y1, U1, R1, D1, T1, S1, P1]
	
		ll.removeAll(al);
		System.out.println(ll);    //   [Y1, U1, R1, D1, T1]
	
	
	}
	
	
	
}