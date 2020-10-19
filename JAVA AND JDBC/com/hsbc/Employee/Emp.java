package com.hsbc.Employee;

public class Emp {
	int empNo;
	String empName;
	double sal;
	String desig;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int empNo, String empName, double sal, String desig) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.sal = sal;
		this.desig = desig;
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", empName=" + empName + ", sal=" + sal + ", desig=" + desig + "]";
	}
	
}
