package com.hsbc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareStudent {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		
		list.add(new Student(3,"Rohan"));
		list.add(new Student(2,"ABC"));
		list.add(new Student(1,"XYZ"));
		
		//Collections.sort(list,new Comparator());
	}

}
