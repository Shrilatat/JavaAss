package com.hsbc.collections;

public class Preson {
	int pid;
	String pname;
	int age;
	public Preson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Preson(int pid, String pname, int age) {
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
		return "Preson [pid=" + pid + ", pname=" + pname + ", age=" + age + "]";
	}
	
	
}
