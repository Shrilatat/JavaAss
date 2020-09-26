package com.hsbc.assignment5;

import java.util.HashMap;
import java.util.Set;

public class Student implements StudIntf {
	
	private HashMap<Integer, String> stud = new HashMap<>();

	@Override
	public void setNames() {
		stud.put(1, "ABC");
		stud.put(2, "PQR");
		stud.put(3, "XYZ");
	}

	@Override
	public void printNames() {
		System.out.println(stud.values());
	}

	@Override
	public void getName(String str) {
		System.out.println(stud.get(str));
	}

	@Override
	public void printSize() {
		System.out.println("Size of HashMap is " + stud.size());
	}

	@Override
	public void remove(Integer i) {
			stud.remove(i);
	}
	
}
