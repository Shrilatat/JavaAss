package com.hsbc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonExtd {
public static void main(String[] args) {
	List<Person>persons=new ArrayList<>();
	
	persons.add(new Person(1,"Asd",30));
	persons.add(new Person(2,"Bsd",20));
	persons.add(new Person(3,"Csd",10));
	persons.add(new Person(4,"Dsd",40));
	
	Iterator<Person> it=persons.iterator();
	while(it.hasNext()) {
		Person p=it.next();
		//System.out.println("Ages after 10 years :"+p.getAge()+10);
		if(p.getAge()>35)
			it.remove();
	}
	System.out.println(persons);
}
}
