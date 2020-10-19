package com.hsbc.collections;

import java.util.ArrayList;
import java.util.List;

public class StudentOp {
	private List<String> names = new ArrayList<String>();
	
	public void setNames(){
		names.add("Vishnu");
		names.add("Gopal");
		names.add("Divya");
	}
	
	public void addName(String str){
		names.add(str);
	}
	
	public void searchName(String name){
		boolean flag = names.contains(name);
		if(flag == true)
			System.out.println("Name is present");
		else
			System.out.println("Name is not present");
	}
	
	public void searchName(int index){
		String tempName = names.get(index);
		
		System.out.println(tempName);
	}
	
	public void printNames(){
		System.out.println(names);
	}
	
	public void removeName(String stuname){
		names.remove(stuname);
		}
}
