package com.hsbc.assignment1;

import java.util.ArrayList;

public class StudentOps {
	
	private ArrayList<String> names=new ArrayList<>();
	
	public void setNames()
	{
		names.add("Sid");
		names.add("Aditya");
		names.add("Pratik");
	}
	
	public void addName(String str)
	{
		names.add(str);
	}
	
	public void searchName(String str)
	{
		int temp=0;
		for (String name : names) {
			if(name==str)
			{
				System.out.println(str +"is in Arraylist");
				temp=1;
			}
			
		}
		if(temp==0)
			System.out.println(str +"is not available in the List");
	}
	
	public void searchName(int ind)
	{
		if(ind<names.size())
		System.out.println(names.get(ind));
	}
	
	
	public void printNames()
	{
		System.out.println("Names in list");
		for (String string : names) {
			{
				
			System.out.println(string);
			}
		}
	}
	
	public void removeName(String stuName)
	{
		if(names.contains(stuName))
		{
			names.remove(stuName);
		}
		else
		{
			System.out.println("Name not present");
		}
	}
	
}
