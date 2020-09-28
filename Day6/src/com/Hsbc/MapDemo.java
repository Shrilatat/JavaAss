package com.Hsbc;

import java.util.HashMap;
import java.util.*;

class Emp{
	int id;String name;
	

	public Emp() {
		super();
	}


	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class MapDemo {
	public static void main(String[] args) {
		
	
	/*Map<Integer,String> map=new HashMap<>(); //key int value string
	
	map.put(1,"Jan");
	map.put(2,"Feb");
	map.put(3,"Mar");
	map.put(4,"Apr");
	
	//System.out.println(map.get(1));
	Set<Integer> keys=map.keySet();//gets all keys
	
	for(Integer key:keys)
	{
		System.out.println(key +":"+map.get(key));
	}
	
	}*/
		
		Map<String,Emp> map=new HashMap<>();
		map.put("")
}
}