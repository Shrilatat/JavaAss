package com.hsbc;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//generics java 5
public class Calldemo {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();//empty diamond operator
		//list will have the duplicate elements
		
		list.add(100);
		list.add(200);
		list.add(90);
		list.add(100);
		
		//int i = (int) list.get(0);
		//System.out.println(list);
		for(Integer obj: list)
			System.out.println(obj);
		
		List<String> modules =new LinkedList<>();
		modules.add("Java");
		modules.add("Servelet");
		modules.add("Spring");
	}
}
