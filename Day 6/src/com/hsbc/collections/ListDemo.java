package com.hsbc.collections;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(100);
		list.add(2000);
		list.add(1000);
		list.add(100);
		
		for(Integer obj : list)
			System.out.println(obj);

		List<String> modules = new LinkedList<String>();
		modules.add("Java");
		modules.add("Servelts");
		modules.add("JSP");
	}

}
