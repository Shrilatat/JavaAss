package com.hsbc.db;

public class Employee {
	private int empid;
	private String name;
	private int sal;
	public Employee(int empid, String name, int sal) {
		super();
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", sal=" + sal + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public int getSal() {
		return sal;
	}
	
	
}
