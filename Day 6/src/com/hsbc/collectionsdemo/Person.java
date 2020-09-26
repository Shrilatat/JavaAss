package com.hsbc.collectionsdemo;

public class Person {

	int pid;
	String name;
	int age;
	public Person(int pid, String name, int age) {
		super();
		this.pid = pid;
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
