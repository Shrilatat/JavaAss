package com.hsbc.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollDemo {
	public static void main(String[] args) {


		/*
		 * Vector v = new Vector(3);
		 * 
		 * System.out.println(v.size() + " " + v.capacity()); v.add("aaa"); v.add(new
		 * Date()); v.add(100); v.add("123");
		 * 
		 * System.out.println(v.size() + " " + v.capacity());
		 * 
		 * v.trimToSize();
		 * 
		 * System.out.println(v.size() + " " + v.capacity());
		 * 
		 * for (Object object : v) { System.out.println(object); }
		 * 
		 * String str = (String) v.get(0); System.out.println("First Element : " + str);
		 */

		//Linked List

		List<Integer> list = new LinkedList<>();
		list.add(100);
		list.add(200);
		list.add(3333);
		list.add(100);

		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		List<String> modules = new ArrayList<>();
		modules.add("Java");
		modules.add("Servlet");
		modules.add("JSP");
		
		Iterator<String> it = modules.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
