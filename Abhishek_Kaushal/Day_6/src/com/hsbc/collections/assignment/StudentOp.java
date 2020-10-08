package com.hsbc.collections.assignment;

import java.util.ArrayList;

public class StudentOp {
	private String name;
	private ArrayList<String> names = new ArrayList<>();

	public void setNames() {
		names.add("Abhishek");
		names.add("Aditi");
		names.add("Ujjwal");
	}

	public void addName(String name) {
		names.add(name);
	}

	public void searchName(String name) {

		if (names.contains(name)) {
			System.out.println(name + " is present in the list at "+names.indexOf(name));
			return;
		}
		System.out.println(name + " is not present in the list");

	}

	public void searchName(int index)
	{
		if(index < names.size())
		{
			System.out.println(names.get(index));
		}
	}
	
	public void printNames()
	{
		for(String entry:names)
		{
			System.out.println(entry);
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

	public ArrayList<String> getNames() {
		return names;
	}

	public void setNames(ArrayList<String> names) {
		this.names = names;
	}

}
