package List_Interface;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;


public class practice_Vector_ArrayList {
	public static void main(String[] args) {
		

		// -List-///// >>> Interface
		// ArrayList
		// Vector-----Stack ...LIFO....... Last in First Out
		// Linkied List 
		
		// Vector //// 
		// legacy 1.0 version // legacy class 
						// collection 1.2 version 
						// genarics 1.5 "<>" angle brackts 
						// multi Threading and syncrozing 
						// 50% increment 
//		
//		Vector<Object> vc = new Vector<Object>();
//		
//		vc.add("ramesh");
//		vc.add("reya");
//		vc.add(0,"sraya");
//		System.out.println(vc);  //[sraya, ramesh, reya, rajkumar, saikumar, 
//		vc.add("rajkumar");
//		vc.add("saikumar");
//		vc.add("stephen");
//		vc.add("charls");
//		vc.add("pradep");
//		vc.add("sudheer");
//		vc.add("rm");
//		vc.add("Rk");
//		vc.add("prasanna");
		
//		vc.add("charls");
//		vc.add("pradep");
//		vc.add("sudheer");
//		vc.add("rm");
//		vc.add("Rk");
//		vc.add("pradep");
//		vc.add("sudheer");
//		vc.add("rm");
//		vc.add("Rk");
		
//		Vector<Object> v1 = new Vector<Object>();
//		v1.add("suresh");
//		v1.add("venkey");
//		v1.add("samuel");
//		v1.add("varma");
		
		
//		Iterator<String>iteration	=v1.iterator();
//		java.util.Iterator<Integer> i=  al.iterator();
//		for(int i=0; i<v1.size();i++) {
//			v1.add(vc.get(i));
//		}
		
//		vc.addAll(1,v1);			// it returns entire for loop 
	
//		System.out.println(vc);
//		System.out.println(vc.size());
//		System.out.println(vc.capacity());
		
//		vc.remove(2);
//		System.out.println(vc);  
//		v1.remove(1); // index 
//		System.out.println(v1);
//		v1.remove("samuel"); // object 
//		System.out.println(v1);
		
//		System.out.println(v1.contains("varma"));
//		
//		Vector<Object> v2 = new Vector<Object>();
		
//		v2.add("venkey");
//		v2.add("suresh");
//		v2.add("samuel");
//		v2.add("suresh"); // duplicate // lastIndexOf();
//		v2.add("varma");
		
		
//		System.out.println(v1.containsAll(v2));
//		System.out.println(v2);
//		v2.set(2, "srinu");
//		System.out.println(v2);
//		System.out.println(v2.get(3));
//		System.out.println(v2.lastIndexOf("varma"));
//		System.out.println(v2.indexOf("suresh"));
//		System.out.println(v2.lastIndexOf("suresh"));
//		System.out.println(v2.lastElement());	// varma
//		System.out.println(v2.firstElement());  // venkey
		
//		Object[] arr=v2.toArray();		// to convert into array 
//		System.out.println(Arrays.toString(arr));  ///  [venkey, suresh, srinu, suresh, varma]
		
		
//		System.out.println(v2.size());
//		System.out.println(v2.capacity());
		
//		Object[] arr = new Object[] {2,5,4,7,9};
//		Vector v3= new Vector(Arrays.asList(arr));
		
//		System.out.println(v3);
//		System.out.println(v3.size());
//		System.out.println(v3.capacity());
		
		
		
		/////-------------- Array List-------------////////////////
		
	
//	Integer[]arl=new Integer[] {4,6,8,4,3,9,4,2,0};			// another way to elements adding 
//	ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(arl));
	
		ArrayList<Integer>arr=new ArrayList<>();
	


		arr.add(2);
		arr.add(12);
		arr.add(8,3);
		arr.add(0,5);
		
//		System.out.println(arr);
//		System.out.println("size of the data::"+arr.size());
//		System.out.println(arr.remove(2));
//		System.out.println(arr);
//		System.out.println(arr.removeAll(arr));
//		System.out.println(arr);
		arr.add(null);
		arr.add(null);
		
		System.out.println(arr);
		// synchronized list 
//		Collections.synchronizedList(arr);
		
		
	} 

}
