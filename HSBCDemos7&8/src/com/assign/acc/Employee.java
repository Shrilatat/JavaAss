package com.assign.acc;

public class Employee {
int empid;
String empname;
int sal;



public Employee(int empid, String empname, int sal) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.sal = sal;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}

}
