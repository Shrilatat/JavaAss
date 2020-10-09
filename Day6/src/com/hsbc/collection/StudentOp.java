package com.hsbc.collection;
import java.util.*;
public class StudentOp {
	private List<String> names = new ArrayList<>();
	public void setNames()
	{
		names.add("a");
		names.add("b");
		names.add("c");
	}
	public void addNames(String str)
	{
		names.add(str);
	}
	public void searchName(String str)
	{
		boolean isThere =  names.contains(str);
		if(isThere)
			System.out.println("Found at " + names.indexOf(str));
		else
			System.out.println("Not found");
	}
	public void searchName(int index)
	{
		names.get(index);
	}
	public void printNames()
	{
		for(Object o : names)
			System.out.println(o);
	}
	public void removeName(String stuName)
	{
		names.remove(stuName);
		System.out.println(names);
	}
}
 