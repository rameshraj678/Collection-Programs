package Map_Interface;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Map_Practice {
public static void main(String[] args) {
	
	//HashTable
	//HashMap
	//Linked HashMap
	
//	Map<Integer, String>mp=new Hashtable<>();				// assending order not posible  //Hashtable
//	Map<Integer, String>mp=new LinkedHashMap<>(); 		// assendig (sorting) order posible     // LinkedHashSet
	Map<Integer, String>mp=new TreeMap<>();				// assending (sorting) ordere posible  // TreeMap
	
	
	mp.put(100, "ramesh");
	mp.put(300, "shrayan");
	mp.put(293, "reyansh");
	mp.put(240, "jimmy"); 
	
//	//mp.put(100, "Raj");  // it can update by same key----- always use----- replace() method 
	
// //	mp.putIfAbsent(100, "raj"); // cann't update in same key

	// Retrival of <...keys..> from the map
	
	Set<Integer>keys=mp.keySet();   // only key value return  keySet() method
	for(Integer key:keys) {
		System.out.println(key);
	}
	System.out.println("-----------------");

// // Retrival of <....values...> form the map
	
	Collection<String>value=mp.values();
	for(String values:value) {
		System.out.println(values);
	}
	System.out.println(".....................");
	
// // Retrival of value from the map based on a key
	
//	System.out.println(mp.get(300));  //shrayan
//	System.out.println("--------------");
//	for(Integer key: keys) {
//		System.out.println(key+">>>>>>"+mp.get(key));
	
//	}
	
//	System.out.println(mp);
//	
//	// Single element Deletion form the map
//
//	System.out.println("...........");
//	mp.remove(100);
//	System.out.println(mp);
//	
//	//varification of element using key and values from the map
	
//	System.out.println("value availbel---true/either --false : "+mp.containsValue("reyansh"));  // contain---using value
//	System.out.println("value availbel---true/either --false:"+mp.containsKey(300));	// contain---using key 
	
//	mp.putIfAbsent(400, "swathi");  //insertion cann't posible override..
//	System.out.println(mp); 

// // entire values deletion // clear() // method 
	
//	System.out.println(mp);
//	System.out.println("---------");
//	mp.clear();
//	System.out.println("no more "+mp);

	
	
// // Retrive with keys and values  entrySet() // method
	Set<Entry<Integer, String>>entries=mp.entrySet();  // both keys and values include  entrySet() 
	for(Entry<Integer, String >entry:entries) {
		Integer key = entry.getKey();
		String values=entry.getValue();
		
		System.out.println(key+">>>>>>>"+values);
	}


}
}
