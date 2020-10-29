package com.hsbc.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentOps1 {

	private Map<String , String> studNames = new HashMap<>();

	public void setStudNames(String roll , String name) {
		studNames.put(roll, name);
	}
	
	public void printNames()
	{
		Set<String> keys = studNames.keySet();
		
		for(String key : keys)
		{
			System.out.println(studNames.get(key));
		}
	}
	
	public void getName(String key)
	{
		System.out.println(studNames.get(key));
	}
	
	public void printSize()
	{
		System.out.println(studNames.size()) ;
	}
	
	public void remove(String key)
	{
		studNames.remove(key);
	}
	
	
	
}
