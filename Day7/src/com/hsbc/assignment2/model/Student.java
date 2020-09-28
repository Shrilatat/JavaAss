package com.hsbc.assignment2.model;

public class Student {

	int roolno;
	String name;
	
	
	public Student() {
		super();
	}
	public Student(int roolno, String name) {
		super();
		this.roolno = roolno;
		this.name = name;
	}
	public int getRoolno() {
		return roolno;
	}
	public void setRoolno(int roolno) {
		this.roolno = roolno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Student [roolno=" + roolno + ", name=" + name + "]";
	}

}
