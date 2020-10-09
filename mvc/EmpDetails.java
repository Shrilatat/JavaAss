package com.hsbc.mvc;



public class EmpDetails {
	int id;
	String name;
	int sal;
	String dept;
	
	public EmpDetails(int id, String name, int sal, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmpDetails [id=" + id + ", name=" + name + ", sal=" + sal + ", dept=" + dept + "]";
	}
	
	
}
