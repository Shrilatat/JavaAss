package com.Hsbc;

public class Person implements Comparable<Person>{
	int pid;
	String name;
	int age;
	
	public Person() {
		super();
	}

	

	public Person(int pid, String name, int age) {
		super();
		this.pid = pid;
		this.name = name;
		this.age = age;
	}



	public int getPid() {
		return pid;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", age=" + age + "]";
	}



	@Override
	public int compareTo(Person p) {
//		if(this.getPid()<p.getPid())
//		return -1;
//		else if(this.getPid()>p.getPid())
//			return 1;
//		else return 0;
		return this.getName().compareTo(p.getName());
	}
	
	
	

}
