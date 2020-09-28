package com.hsbc.collections;

import java.util.*;

public class PersonDemo {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();

		persons.add(new Person(1, "Amisha", 24));
		persons.add(new Person(2, "Mauli", 25));
		persons.add(new Person(3, "Aditi", 26));
		persons.add(new Person(4, "Parth", 27));
		persons.add(new Person(5, "Pratham", 28));

		Iterator<Person> it = persons.iterator();
		while (it.hasNext()) {

//			System.out.println(it.next());

//			Person p = it.next();
//			System.out.println(p.getAge()+10);

			Person p = it.next();
			if (p.getAge() > 35)
				it.remove();

		}

	}

}
