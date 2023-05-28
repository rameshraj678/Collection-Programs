package Itaration;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;
import java.util.Stack;

public class Enumarator_prctice {

	public static void main(String[] args) {
		
		//Enumaraton-interface  -- only one director 
		// enumartaion is lagacy collection objects
		//legacy classes v1.0
		//HashTable, Stack, Vector, these  are Legacy classes---old-version 
		// cont able to remove and add 
		
		
//		Vector<String> v=new Vector<>(); //Hashtable, Stack same operataions  // after 
//		Hashtable<String, Integer> ages =new Hashtable();
		Stack<String> s= new Stack<>();
		
		
		s.add("Ramesh");
		s.add("Shrayan");
		s.add("reyansh");
		s.add("rajkuamar");
		
//		Enumeration<String>e=v.elements();		// after use enumaration 
		//e.hasMoreElements()
		//e.nextElement()
		
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
		
		
//		Hashtable<String, Integer> ages =new Hashtable();
//		ages.put("Ramesh", 400);
//		ages.put("murali",320);
//		ages.put("maruthi", 350);
//		ages.put("prudvi",350);
//		ages.put("rajesh", 400);
	
//		Enumeration<Integer>e =ages.elements();
		
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
		
		Properties prop=new Properties();
		prop.setProperty("url","facebook");  //facebook
		prop.setProperty("username", "admin"); //admin
		prop.setProperty("password", "admin123"); //admin123
		
		Enumeration<Object>e=prop.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		prop.elements().asIterator();
	}
}
