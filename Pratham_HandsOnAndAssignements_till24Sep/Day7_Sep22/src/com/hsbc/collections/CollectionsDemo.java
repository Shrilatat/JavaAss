package com.hsbc.collections;

import java.util.*;

public class CollectionsDemo {
	public static void main(String[] args) {
		StudentOps student = new StudentOps();
		
		student.setNames();
		student.addName("Aditya");
		student.printNames();
		
		try {
			student.searchNames("Pratham");
		} catch (NameNotFound e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		try {
			student.searchNames(2);
		} catch (NameListIndexOutOfBounds e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			student.removeNames("a");
		} catch (NameDoesntExist e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Student List after removal");
			student.printNames();
		}
		
	}
}
