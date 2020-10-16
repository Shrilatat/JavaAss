package com.hsbc.javaFeatures;

public class Emp {

	private int empid;
	private String empName;
	
	public Emp(int empid, String empName) {
		super();
		this.empid = empid;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", empName=" + empName + "]";
	}



}
