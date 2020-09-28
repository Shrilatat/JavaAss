package com.hsbc.collections;

import java.util.*;

public class StudentOp {

	private List<String> names = new ArrayList<>();

	public void setNames() {
		names.add("Amisha");
		names.add("Aditi");
		names.add("Mauli");
		names.add("Parth");
		names.add("Fareeya");
		names.add("Pratham");
	}

	public void addNames(String str) {
		names.add(str);
	}

	public void searchNames(String name) {
//		boolean check = names.contains(name);
//		if(check == true)
//			System.out.println("The entered name "+name+" is found.");
//		else
//			System.out.println("The entered name "+name+" is not found.");

		if (names.contains(name) == true)
			System.out.println("The entered name " + name + " is found.");
		else
			System.out.println("The entered name " + name + " is not found.");

	}

	public void searchNames(int index) {
		System.out.println("The name at index " + index + " is " + names.get(index));
	}

	public void printNames() {
		for (String obj : names)	//syntactic sugar
			System.out.println(obj);

		//Pre JDK 5
//		Iterator<String> it = names.iterator();
//		while(it.hasNext() == true)
//			System.out.println(it.next());
	}

	public void removeNames(String stuName) {

		if (names.contains(stuName) == true)
			names.remove(stuName);
		else
			System.out.println("The name to be removed is not found in the list.");

	}

}
