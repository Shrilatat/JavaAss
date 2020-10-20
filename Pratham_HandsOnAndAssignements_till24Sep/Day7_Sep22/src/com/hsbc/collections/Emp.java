package com.hsbc.collections;

//enum DESIGNATION{
//	ASE, SE, SSE, TSE
//}

public class Emp {
	int empNo;
	String empName;
	float sal;
	String desig;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Emp(int empNo, String empName, float sal, String desig) {
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
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	@Override public String toString() {
		return empNo+","+empName+","+sal+","+desig;
	}
}
