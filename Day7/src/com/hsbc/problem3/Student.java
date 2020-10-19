package com.hsbc.problem3;

import java.util.HashMap;
import java.util.Map;

public class Student {
	
	private Map<Integer , String > studNames = new HashMap<>();
	
	public void setNames(int key , String name) {
		studNames.put(key, name);		
	}
	public void printNames() {
		for(Map.Entry<Integer , String > entry : studNames.entrySet()) {
			System.out.println("Names = " + entry.getValue());
		}
		
	}
	public void getName(int key) {
		String names = studNames.get(key);
		System.out.println(names);		
	}
	public void printSize() {
		System.out.println(studNames.size());
	}
	public void remove(int key) {
		studNames.remove(key);
	}
		
	
	
}
