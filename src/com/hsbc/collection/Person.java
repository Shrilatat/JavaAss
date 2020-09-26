package com.hsbc.collection;

public class Person implements Comparable<Person> {
	int pid;
	String pname;
	int age;
	public Person() {
		super();
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
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Person p) {
//		if(this.getPid() < p.getPid())
//			return -1;
//		else if(this.getPid() > p.getPid())
//			return 1;
//		else return 0;
		return this.getPname().compareTo(p.getPname());
	}
}
