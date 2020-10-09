package com.hsbc.collection;

public class Emp {
	int empNo;
	String empName;
	double sal;
	String design;
	//List<Emp> emps = new ArrayList<>();
	public Emp() {}
	public Emp(int empNo, String empName, double sal, String design) {
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
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
