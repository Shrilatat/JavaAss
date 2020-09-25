package com.hsbc.collection;

import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		//empty diamond operator, RHS no need to add generics
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(2);
		list.add(1012);
		list.get(0);
		list.add(100);
		//System.out.println(list); //instead use For each group.
		for(int obj : list)
			System.out.println(obj);
		Iterator<Integer> i = list.iterator();
		while(i.hasNext())
		{
			int m = i.next();
			System.out.println(m*m);
		}
	}
}
