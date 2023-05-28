package Set_interface;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;
public class set_Practice {
public static void main(String[] args) {
	

//	Hashset->  HashMap -> array of nodes(key,value)

//		Set<Integer> hs = new HashSet<>();
//		HashSet<Integer> hs = new HashSet<>(); // order not maintain          ......  hs:[6, 23, 89, 10, 43]
//		LinkedHashSet<Integer>lhs=new LinkedHashSet<>(); // oder maintain -----lha: [43, 23, 89, 10, 6]
		
		TreeSet<Integer>ts=new TreeSet<>();  // elements can store sorted (assending) order  ----ts: [6, 10, 23, 43, 89]
		// Treeset----TreeMap-----binary tree
		ts.add(43);
		ts.add(23);
		ts.add(89);
		ts.add(10);
		ts.add(6);
		System.out.println(ts);
		
		ts.add(10); // set not allow duplicate values
	
		System.out.println(ts);
//		System.out.println(ts);
//		System.out.println(ts.isEmpty());
//		System.out.println(ts.size());
//		System.out.println(ts.remove(6));
//		System.out.println(ts);
		
		
	// Aditinal operations :  lowest element and highest element  
		
		
//		System.out.println(ts.first());   //6
//		System.out.println(ts.last());  //89
//		System.out.println(ts.pollFirst());  // lowest element fetch and remove
//		System.out.println(ts.pollLast());  // heigst element tetch and remove 
//		System.out.println(ts); 					// [10, 23, 43]
		
		System.out.println(ts.subSet(5, 50)); // between  two elements [6, 10, 23, 43]
		System.out.println(ts.subSet(5, 50).remove(10));  //remove element  == true return in consol 
		System.out.println(ts.subSet(5, 50));  //between two and remove  elements  [6, 23, 43] 
		System.out.println(ts.descendingSet());   //  [89, 43, 23, 6]
		
}
}
