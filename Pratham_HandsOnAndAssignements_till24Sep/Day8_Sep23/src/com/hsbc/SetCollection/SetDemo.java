package com.hsbc.SetCollection;

import java.util.*;

public class SetDemo {
	public static void main(String[] args) {
		TreeSet<Person> personSet = new TreeSet<>();
		
		personSet.add(new Person(19,"aaa",12));
		personSet.add(new Person(3,"hg",56));
		personSet.add(new Person(9,"aja",19));
		
		for(Person p: personSet) {
			System.out.println(p);
		}
		
	}
}
////Difference between comparable and comparator and when to use which and why 
//if there is an advantage of one on other