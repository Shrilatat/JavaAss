package com.hsbc.Tasks;

import java.util.*;

public class Student {

	private Map<String, String> studNames = new HashMap<>();

	public void setNames() {
		studNames.put("aaa", "Amisha");
		studNames.put("bbb", "Aditi");
		studNames.put("ccc", "Mauli");
	}

	public void printNames() {
		System.out.println(studNames.values());
	}

	public void getNames(String key) {
		System.out.println(studNames.get(key));
	}

	public void printSize() {
		System.out.println(studNames.size());
	}

	public void remove(String key) {
		studNames.remove(key);
		printNames();
	}

}
