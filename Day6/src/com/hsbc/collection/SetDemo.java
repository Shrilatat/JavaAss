package com.hsbc.collection;

import java.util.*;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("M");
		set.add("a");
		set.add("u");
		set.add("l");
		set.add("i");
		set.add("i");

		System.out.println(set);
		System.out.println(set.size());
		
		System.out.println("=========================");
		Set<String> set1 = new LinkedHashSet<>();
		set1.add("M");
		set1.add("a");
		set1.add("u");
		set1.add("l");
		set1.add("i");
		set1.add("i");
		System.out.println(set1);
		System.out.println(set1.size());
		
		System.out.println("=========================");
		Set<Person> set2 = new TreeSet<>();
		set2.add(new Person(1,"a",21));
		set2.add(new Person(4,"j",25));
		set2.add(new Person(2,"f",24));
		set2.add(new Person(5,"g",28));
		set2.add(new Person(6,"b",22));
		set2.add(new Person(3,"v",20));
		for(Person p: set2)
			System.out.println(p);
	}
}
