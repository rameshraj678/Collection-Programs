package Itaration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Vector;

public class Iterator {

	public static void main(String[] args) {
	
		/// Iterator
		
		
		//Iteration-interface
		// introduce for iterating the all collection objerc
		//legacy classes v1.0 and new classes 
		//HashTable, Stack, Vector, Dictory
		// one direction, read only with special permission for removie  
	
//		ArrayList<Integer> al = new ArrayList<>();
//		al.add(4);
//		al.add(5);
//		al.add(87);
//		al.add(90);
//		
//		java.util.Iterator<Integer> i=  al.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//			i.remove();
//		}
//		System.out.println(al);
	
		HashMap<Integer, String>hm=new HashMap<>();
		
//		hm.put(56, "kukataplli");
//		hm.put(70, "Madhapur");
//		hm.put(89, "balanagar");
//		hm.put(50, "Gandhinagar");
//		
//		System.out.println(hm.keySet().iterator());
//			hm.values().iterator();
//			hm.entrySet().iterator();
//			hm.entrySet().iterator();
		
			//List Iterator
			// listInterger -- interface 
			// read and write 
			// applicable for old-v- legacy class and new new-v-classes 
		
			Vector<Integer> al = new Vector<>();
			
			al.add(8);
			al.add(5);
			al.add(23);
			ListIterator<Integer>lit=al.listIterator();
			
			while(lit.hasNext()) {
				System.out.println(lit.next());
			}
			lit.add(44);
			System.out.println();
			
			while(lit.hasPrevious()) {
				System.out.println(lit.previous());
			}
		lit.remove();
		System.out.println(lit);
		
	}

}
