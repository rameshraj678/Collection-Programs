package Quess_Interface;

import java.util.*;

public class Practice {

	public static void main(String[] args) {
		
		
		///  Queues // First in First Out

		// it cann't follow the sorting order but starting index priority high (head position)
		// Default capacity 11
//		PriorityQueue<Integer>pq=new PriorityQueue<>();   // left side Queue interface can use ---"Queue<>qu=new Queue<>();"
		
		// Addition--offer, add
		// retrival -- peek
		// Removal--poll, remove
	
		/// -------- prerioty queue--------////////////
		PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());		// highest number preority order		
		pq.add(5);
		pq.offer(2);
		pq.offer(9);
		pq.add(7);
		pq.add(6);
		
		System.out.println(pq);						//[2, 5, 9, 7, 6]
//		System.out.println(pq.peek());
//		System.out.println(pq.poll());
//		System.out.println(pq);
	
//		while (!pq.isEmpty()) {
//			System.out.print(pq.poll()+"  ");    //2  5  6  7  9  
			
//			while (!pq.isEmpty()) {
//				System.out.print(pq.poll()+"  ");    //9  7  6  5  2    // using Comparaton.reverseOrder();
//	}
	
		
		///>>>>>>>>>>   ArrayDeque   <<<<<<<<<<<<<<////////
	
		// Default  capacity -----17
		// adding head position and tail
		// retreval head position and tail position 
		// remove head position and taili position can posible 
		
		// Additon: offer, offerFirst, OfferLast, add addFirst, addLast, 
		// retrieval : peek, peekFirst, peekLast
		// removal: removeFirst, removeLast
		
		ArrayDeque<String>ad=new ArrayDeque<>();
		
		ad.add("orange");
		ad.addFirst("Apple");
		ad.addLast("grapes");
		ad.offerFirst("Kiwi");
		ad.offerLast("Mango");
		ad.offer("watermilon");
		
		System.out.println(ad);   //[Kiwi, Apple, orange, grapes, Mango, watermilon]
		
		//peek>>> retrival 
		System.out.println(ad.peekFirst());
		System.out.println(ad.peek());
		System.out.println(ad.peekLast());
		
		//poll>>> remove
		
		System.out.println(ad.poll());
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollLast());
		
	System.out.println(ad.size());
	System.out.println(ad);
	
	
		
		
		
		
		
		

	}

}
