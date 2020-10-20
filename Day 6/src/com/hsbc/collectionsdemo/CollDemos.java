package com.hsbc.collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollDemos {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList();
		persons.add(new Person(1,"aaa" , 30));
		persons.add(new Person(2,"bbb" , 31));
		persons.add(new Person(3,"ccc" , 32));
		persons.add(new Person(4,"ddd" , 33));
		persons.add(new Person(5,"eee" , 34));
		
		Iterator<Person> it = persons.iterator();
		while(it.hasNext())
		{
			Person p = it.next();
			//System.out.println(p.getAge() + 10);
			if(p.getAge() > 33)
				persons.remove(p);
		}
		
		
	}

}
