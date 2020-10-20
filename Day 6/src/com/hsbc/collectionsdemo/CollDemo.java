package com.hsbc.collectionsdemo;

import java.util.*;

public class CollDemo {

		public static void main(String[] args) {
			Vector v = new Vector(3);
			System.out.println(v.size());
			System.out.println(v.capacity());
			
			v.add("aaa");
			v.add(new Date());
			v.add(new Integer(100));
			
			for(int i=0 ; i<v.size() ; i++ )
				System.out.println(v.get(i));
			
			for(Object o : v)
				System.out.println(o);
			
			String str = (String) v.get(0);
			Date d1 = (Date) v.get(1);
			
			
			
			
			
			/*
			 * System.out.println(v.size()); System.out.println(v.capacity());
			 * 
			 * v.add("aaa"); v.add(new Date()); v.add(new Integer(100));
			 * System.out.println(v.size()); System.out.println(v.capacity());
			 * 
			 * v.trimToSize(); System.out.println("-----------------");
			 * System.out.println(v.size()); System.out.println(v.capacity());
			 */
		}
	
}
