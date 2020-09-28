package com.Hsbc;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
//		HashSet <String>set=new HashSet<>();
//		Set <String>set=new LinkedHashSet<>();
//		Set <String>set=new TreeSet<>();//sorts the list
//		set.add("aaa");
//		set.add("ooo");
//		set.add("bbb");
//		set.add("ccc");
//		set.add("zzz");
//		set.add("ddd");
//		set.add("bbb");
//		System.out.println(set);
		//Comparable eg
//		Person p=new Person();
//		Set <Person> persons =new TreeSet<>();
//		persons.add(new Person(16,"Sid",20));
//		persons.add(new Person(12,"zzd",24));
//		persons.add(new Person(13,"aad",26));
//		System.out.println(persons);
		TreeSet <Integer>set=new TreeSet<>();
		set.add(10);
		set.add(60);
		set.add(30);
		set.add(1);
		System.out.println(set.descendingSet());
		
		
	}
}
