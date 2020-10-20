package day6;

import java.util.Date;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionsDemo {
	public static void main(String[] args) {
		/*
		 * Vector v = new Vector(5); System.out.println(v.size());
		 * System.out.println(v.capacity());
		 * 
		 * v.add("aaa"); v.add(new Date()); v.add(100);
		 * 
		 * System.out.println(v.size()); System.out.println(v.capacity());v.add("aaa");
		 * v.add(new Date()); v.add(100);
		 * 
		 * System.out.println(v.size()); System.out.println(v.capacity());
		 * 
		 * v.trimToSize(); System.out.println(v.size());
		 * System.out.println(v.capacity());
		 * 
		 * // for (int i = 0; i < v.size(); i++) { // System.out.println(v.get(i)); // }
		 * 
		 * for (Object object : v) { System.out.println(object); }
		 * 
		 * String str = (String)v.get(0); Date d1 = (Date) v.get(1);
		 * 
		 * System.out.println(d1);
		 */
		
		LinkedList list = new LinkedList();
		list.add(100);
		list.add(200.78);
		list.add("Aditi");
		
		
	}
}
