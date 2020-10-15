package com.hsbc.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();        	//LinkedHashSet : Ordered HashSet
													//TreeSet : Sorted Set
		set.add("aaa");
		set.add("ooo");
		set.add("ccc");
		set.add("mmm");
		set.add("kkk");
		
		System.out.println(set);
		
		TreeSet<Integer> set1 = new TreeSet<>();
		
		set1.add(12);
		set1.add(23);
		set1.add(50);
		set1.add(40);
		
		System.out.println(set1);
		
		System.out.println(set1.descendingSet());
		
	}

}
