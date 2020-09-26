package com.hsbc.collection;

import java.util.Comparator;

public class Student implements Comparator<Student> {
	int rollno;
	String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	@Override
	public int compare(Student o1, Student o2) {
		return o1.rollno-o2.rollno;
	}
	
	
	
	
}
