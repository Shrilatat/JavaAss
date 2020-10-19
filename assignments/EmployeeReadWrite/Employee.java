package com.hsbc.assignments;
/**
* Model class containing employee details
*
/
public class Employee {
private int empNo;
private String empName;
private int empBasic;
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
public int getEmpBasic() {
	return empBasic;
}
public void setEmpBasic(int empBasic) {
	this.empBasic = empBasic;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int empNo, String empName, int empBasic) {
	super();
	this.empNo = empNo;
	this.empName = empName;
	this.empBasic = empBasic;
}
@Override
public String toString() {
	return "Employee [empNo=" + empNo + ", empName=" + empName + ", empBasic=" + empBasic + "]";
}

}
