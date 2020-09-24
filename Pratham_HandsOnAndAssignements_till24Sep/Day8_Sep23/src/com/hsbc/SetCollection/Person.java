package com.hsbc.SetCollection;

public class Person implements Comparable<Person> {
	int pid;
	String pname;
	int age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int pid, String pname, int age) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.age = age;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public
	String toString() {
		return pid +", " +pname+" ," +age;
	}
	
	@Override 
	public int compareTo(Person o) {
		if(this.getPid()<o.getPid()) {
			return -1;
		}
		else if(this.getPid()>o.getPid()) {
			return 1;
		}
		else
			return 0;
	}
}
