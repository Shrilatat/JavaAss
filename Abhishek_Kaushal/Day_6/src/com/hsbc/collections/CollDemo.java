package com.hsbc.collections;

import java.util.LinkedList;
import java.util.Vector;

public class CollDemo {
	public static void main(String[] args) {
//		Vector vector = new Vector();
//		System.out.println(vector.size());
//		System.out.println(vector.capacity());
//		vector.add("bbb");
//		vector.add(new Integer(5));
//		vector.add(100);
//		
//		System.out.println(vector.size());
//		System.out.println(vector.capacity());
//		
//		vector.add("bbb");
//		vector.add(new Integer(5));
//		vector.add(100);
//		
//		System.out.println(vector.size());
//		System.out.println(vector.capacity());
//		
//		vector.add("bbb");
//		vector.add(new Integer(5));
//		vector.add(100);
//		
//		System.out.println(vector.size());
//		System.out.println(vector.capacity());
//		
//		vector.add("bbb");
//		vector.add(new Integer(5));
//		vector.add(100);
//		
//		System.out.println(vector.size());
//		System.out.println(vector.capacity());
//		
//		vector.trimToSize();
//		System.out.println(vector.size());
//		System.out.println(vector.capacity());
//		
//		
//		for(Object o: vector)
//		{
//			System.out.println(o);
//		}
//		
//		String str= (String)vector.get(0);
//		System.out.println(str);
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		
		int i = list.get(0);
		for(Integer obj: list)
		{
			System.out.println(obj);
		}
		
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("Java");
		list1.add("Servlet");
		
		
		String i1 = list1.get(0);
		for(String obj1: list1)
		{
			System.out.println(obj1);
		}
	}
	

}
