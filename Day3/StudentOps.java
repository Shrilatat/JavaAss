package com.hsbc.Day3Ass;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentOps {
	
	private Map<String, String> studNames = new HashMap<>();
	
	public void setNames( String rollno, String name) {
		studNames.put(rollno, name);
	}
	
	public void printNames() {
		Set<String> students = studNames.keySet();
		for(String student: students)
			System.out.println(student);
	}
	
	public void getName(String key) {
		System.out.println(studNames.get(key));
	}
	
	public void printSize() {
		System.out.println(studNames.size());
	}
	
	public void remove(String key) {
		studNames.remove(key);
	}
}
