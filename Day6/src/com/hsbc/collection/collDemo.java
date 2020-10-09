package com.hsbc.collection;
import java.util.*;
/*
 * CollDemo is a practice for collection concepts
 */
public class collDemo {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1,"a",30));
		persons.add(new Person(2,"b",32));
		persons.add(new Person(1,"c",45));
		List<Person> px = Arrays.asList(new Person(1,"a",30),
				new Person(1,"a",30), new Person(1,"a",30));
		Iterator<Person> i = persons.iterator();
		while(i.hasNext())
		{
			Person p = i.next();
			if(p.getAge() > 35)
				i.remove();
			
		}
		System.out.println(persons);
	}
}
           
//Empty collection, named v.
//		Vector v = new Vector();
//		System.out.println(v.size());
//		System.out.println(v.capacity());
//		v.add("mauli");
//		v.add(new Date());
//		//wrapper class: wrap the primitive in object
//		v.add(new Integer(100)); 
//		v.add(10);
//		System.out.println(v.size());
//		System.out.println(v.capacity());
//		v.trimToSize();
//		System.out.println("============");
//		System.out.println(v.capacity());
//		System.out.println(v);
//		for(Object o: v)
//			System.out.println(o);
//		String s = (String)v.get(0);
	//	System.out.println(s);