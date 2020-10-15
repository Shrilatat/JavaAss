package com.hsbc.assignment1;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * Student List Collection
 * @author suryavanshi
 *
 */

public class StudentOp {
	private ArrayList<String> names = new ArrayList<>();

	public StudentOp() {
		names.add("Rohan");
		names.add("Ujjwal");
		names.add("Prajwal");
	}

	public void addName(String str) {
		names.add(str);
		System.out.println(str + " is added to Student List");
	}

	public void searchName(String name) {
		if(names.contains(name))
			System.out.println(name + " is present in Student List");
		else
			System.out.println(name + " is not present in Student List");
	}

	public void searchName(int index) {
		System.out.println("Student " + names.get(index) + " is present at index " + index);
	}

	public void printNames() {
		System.out.println("Students List is :");
		for (String string : names) {
			System.out.print(string + " ");
		}
		
		for (Iterator iterator = names.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			
		}
	}
	
	public void removeName(String stuName) {
		names.remove(stuName);
		System.out.println("\nStudent " + stuName + " is removed");
	}
}
