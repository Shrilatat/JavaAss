package com.hsbc.collectionsdemo;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		//To add different datatypes 
		LinkedList<Comparable> list = new LinkedList();
		list.add(100);
		list.add(200.78);
		list.add("Aditi");
		
		//To add only integers
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		
		for(Integer obj : list1)
		System.out.println(obj);
		
		int i = (int) list.get(0);
		System.out.println(list);
	}

}
