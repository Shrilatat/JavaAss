package com.hsbc.collectionsdemo;

import java.util.ArrayList;

public class StudentOp {
	ArrayList<String> names = new ArrayList<String>();
	
	public void setNames() 
	{
		names.add("Aditi");
		names.add("Akash");
		names.add("Chaitra");
		names.add("Sita");
		
	}
	
	public void addName(String str) 
	{
		names.add(str);
		System.out.println(names);
	}
	
	public void searchName(String name) 
	{
		boolean i = names.contains(name);
		if(i)
			System.out.println(name);
		
	}
	
	public void searchName(int index) 
	{
		System.out.println(names.get(index));
	}
	
	public void printNames() 
	{
		for(String str :names)
			System.out.println(str);
	}
	
	public void removeName(String stuName) 
	{
		names.remove(stuName);
		System.out.println(names);
	}
	

}
