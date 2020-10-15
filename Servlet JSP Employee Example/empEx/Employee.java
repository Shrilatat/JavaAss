package com.hsbc.servletdemo.empEx;

public class Employee {
	private String eid;
	private String ename;
	private String sal;
	private String dept;
	public Employee() {
	}
	public Employee(String eid, String ename, String sal, String dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.dept = dept;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
		
}
