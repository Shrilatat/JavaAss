package com.hsbc.collects;

public class Emp {
	private int empNo;
	private String empName;
	private int sal;
	private String design;
	
	
	public Emp() {
	}


	public Emp(int empNo, String empName, int sal, String design) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.sal = sal;
		this.design = design;
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


	public String getDesign() {
		return design;
	}


	public void setDesign(String design) {
		this.design = design;
	}


	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", empName=" + empName + ", sal=" + sal + ", design=" + design + "]";
	}
	
	
}
