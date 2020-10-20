package com.trg.annon;

public class Employee {
	int empid;
	String empname;
	
	
	

	public Employee(int i, String string) {
		this.empid  =i;
		this.empname = string;
	}




	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	

}
