package com.hsbc.set;

import java.lang.*;
import java.io.*;
import java.util.*;

public class Person implements Comparable<Person> {

	private int pid;
	private String pName;
	private int age;

	public Person() {
	}

	public Person(int pid, String pName, int age) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.age = age;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pName=" + pName + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person p) {
//		if (this.getPid() < p.getPid())
//			return -1;
//		else if (this.getPid() > p.getPid())
//			return 1;
//		else
//			return 0;
		 return this.getpName().compareTo(p.getpName());
	}

}
