package com.hsbc.assignment2;

public class Emp {
	
	private int empNo;
	private String empName;
	private int sal;
	private String designation;
	
	public Emp(int empNo, String empName, int sal, String designation) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.sal = sal;
		this.designation = designation;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", empName=" + empName + ", sal=" + sal + ", designation=" + designation + "]";
	}
	
	
}
