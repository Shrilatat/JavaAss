package com.Hsbc;

import java.util.ArrayList;

public class StudentOp {

	private ArrayList<String> names;
	
	public void setNames(StudentOp op)
	{
		names.add("Sid");
		names.add("uj");
		names.add("push");	
	}
	
	public void addNames(String str)
	{
		names.add(str);
	}
	
	public void searchNames(String str)
	{
		if(names.contains(str))
			System.out.println(str+"is in list");
	}
	
	public void searchNames(int x)
	{
		names.add(x,"Someone");
	}
	public void printNames()
	{
		for (String string : names) {
			System.out.println(string);
		}
	}

	
}
