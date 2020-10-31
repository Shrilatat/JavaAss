package com.abc.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentOpsAssign {
	private Map<String,String> studNames = new HashMap<>();
	
	public void setNames() {
		studNames.put("abc1", "name_1");
		studNames.put("abc2", "name_2");
		studNames.put("abc3", "name_3");
		studNames.put("abc4", "name_4");
		studNames.put("abc5", "name_1");
		studNames.put("abc6", "name_6");
	}
	
	public void printNames() {
		Set<String> keys = studNames.keySet();
		for (String s : keys) {
			System.out.println(studNames.get(s));
		}		
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
