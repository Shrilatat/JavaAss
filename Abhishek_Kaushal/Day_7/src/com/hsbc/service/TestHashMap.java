package com.hsbc.service;

import com.hsbc.dao.Student;
import com.hsbc.model.NoKeyFoundException;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student();
		stud.setNames();
		stud.printNames();
		System.out.println();
		
		try {
			stud.getName("222");
		} catch (NoKeyFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		stud.printSize();
		System.out.println();
		
		try {
			stud.remove("333");
		} catch (NoKeyFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		stud.printNames();
		System.out.println();
		
		
		
	}

}
