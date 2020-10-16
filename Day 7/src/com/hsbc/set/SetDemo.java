package com.hsbc.set;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Person> persons = new TreeSet<>();
		
		persons.add(new Person(11,"aaa",35));
		persons.add(new Person(2,"bbb",34));
		persons.add(new Person(9,"ccc",33));
		persons.add(new Person(4,"ddd",32));
		persons.add(new Person(5,"eee",31));

		for(Person p : persons)
			System.out.println(p);
	}

}
