package com.hsbc.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionPerson {

	public static void main(String[] args) {

		//List<Person> persons = new ArrayList<>();
		Set<Person> persons = new TreeSet<>();
		
		persons.add(new Person(1,"zzz",22));
		persons.add(new Person(2,"ddd",36));
		persons.add(new Person(3,"aaa",30));
		persons.add(new Person(4,"ccc",44));
		
		for (Person person : persons) {
			System.out.println(person);
		}
		
		/*
		 * Iterator<Person> it = persons.iterator(); while(it.hasNext()) { Person p =
		 * it.next(); if(p.getAge() > 35) it.remove(); }
		 * 
		 * System.out.println(persons);
		 */
		}

}
