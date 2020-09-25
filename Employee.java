package com.hsbc;
import java.io.*;
public class Employee implements Serializable{
private int empid;
private String empName;
private int empbasic;
public Employee(int empid, String empname, int basic) {
	super();
	this.empid = empid;
	this.empName = empname;
	this.empbasic = basic;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empName;
}
public void setEmpname(String empname) {
	this.empName = empname;
}
public int getBasic() {
	return empbasic;
}
public void setBasic(int basic) {
	this.empbasic = basic;
}

}
