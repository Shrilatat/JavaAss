package com.hsbc.trg;

public class Employee {

	int empid;
	String ename;

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + "]";
	}

}
