package com.hsbc;

import java.util.Set;
import java.util.TreeSet;
public class SetDemo1 {
	public static void main(String[] args) {
		Set<Person>persons=new TreeSet<>();
		persons.add(new Person(1,"Bsd",30));//person class is compared
		persons.add(new Person(2,"Csd",28));
		persons.add(new Person(3,"Asd",33));
		persons.add(new Person(4,"Dsd",37));
		
		for(Person p:persons)
			System.out.println(p);
}
}