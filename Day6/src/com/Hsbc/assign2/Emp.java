package com.Hsbc.assign2;

public class Emp {

	int empNo,sal;	String empName,design;
	public Emp() {
		super();
	}
	public Emp(int empNo, int sal, String empName, String design) {
		super();
		this.empNo = empNo;
		this.sal = sal;
		this.empName = empName;
		this.design = design;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", sal=" + sal + ", empName=" + empName + ", design=" + design + "]";
	}
	
	
	
	
}
