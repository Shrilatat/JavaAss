package com.hsbc.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.hsbc.model.NoKeyFoundException;

public class Student {
	
	private Map<String, String> map = new HashMap<>();
	
	public void setNames()
	{
		map.put("111", "AAA");
		map.put("222", "BBB");
		map.put("333", "CCC");
		map.put("444", "DDD");
		map.put("555", "EEE");
	}
	
	public void printNames()
	{
		Set<String> rollNumbers = map.keySet();
		for(String rollNo : rollNumbers)
		{
			System.out.println(map.get(rollNo));
		}
		
	}
	
	public void getName(String key) throws NoKeyFoundException
	{
		if(map.containsKey(key))
		{
			System.out.println(map.get(key));
			return;
		}
		throw new NoKeyFoundException("No such key");
	}
	
	public void printSize() {
		System.out.println(map.size());
	}
	
	public void remove(String key) throws NoKeyFoundException {
		if(map.containsKey(key))
		{
			map.remove(key);
			return;
		}
		throw new NoKeyFoundException("No such key");
	}

}
