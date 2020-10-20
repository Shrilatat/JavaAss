package com.hsbc.collections;

import java.util.*;

class NameListIndexOutOfBounds extends Exception{

	public NameListIndexOutOfBounds() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NameListIndexOutOfBounds(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

class NameNotFound extends Exception{

	public NameNotFound() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NameNotFound(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
class NameDoesntExist extends Exception{

	public NameDoesntExist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NameDoesntExist(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

public class StudentOps {
	private ArrayList<String> nameList= new ArrayList();
	
	StudentOps(){}
	
	public void setNames() {
		nameList.add("Pratham");
		nameList.add("Gordon");
		nameList.add("Drogo");
	}
	
	public void addName(String str) {
		nameList.add(str);
	}
	
	public void searchNames(String name) throws NameNotFound {
		boolean hasName = nameList.contains(name);
		if(hasName==true) {
			System.out.println("This student is in the DB");
		}
		else
			throw new NameNotFound("This student does not exist");
	}
	public void searchNames(int index) throws NameListIndexOutOfBounds {
		if(index>0)
			System.out.println("The name at given index is : "+nameList.get(index));
		else
			throw new NameListIndexOutOfBounds("The index inout is out of bounds");
	}
	public void printNames() {
		System.out.println("The Student List is : "+nameList);
	}
	
	public void removeNames(String stuName) throws NameDoesntExist {
		if (nameList.contains(stuName))
			nameList.remove(stuName);
		else
			throw new NameDoesntExist("This student does not exist");
	}
	
}
