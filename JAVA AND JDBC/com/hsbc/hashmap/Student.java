package com.hsbc.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Student {
	private HashMap<String, String> hmap = new HashMap<>();

	public void setNames() {
		hmap.put("1", "Divya");
		hmap.put("2", "Vishnu");
		hmap.put("3", "Gopal");
		hmap.put("4", "Swarali");
	}

	public void printNames() {
		Set<String> traverse = hmap.keySet();
		
		for (String string : traverse) {
			System.out.println(string + " " + hmap.get(string));
		}
	}

	public void getName(String key){
		System.out.println(hmap.get(key));
	}

	public void printSize(){
		
		System.out.println(hmap.size());
	}

	public void remove(String key){
		hmap.remove(key);
	}
}
