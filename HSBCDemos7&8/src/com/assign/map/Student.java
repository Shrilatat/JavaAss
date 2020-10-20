package com.assign.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Student {
	HashMap<String, String> hmap = new HashMap<String, String>();
	
	public void setNames(String key , String value) {
		hmap.put(key , value);
	}
	public void printNames() {
	System.out.println(hmap.values());
	}
	

	public void getName(String Key) {
		String var = hmap.get(Key);
		System.out.println(var);
	}
	public void printSize() {
		System.out.println(hmap.size());
	}
	public void remove(String key) {
		hmap.remove(key);
		
	      }
	}


