package com.hsbc.DB;

import java.util.ArrayList;
import java.util.List;

public class Emp {
	int empId;
	String emp;
	int sal;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int empId, String emp, int sal) {
		super();
		this.empId = empId;
		this.emp = emp;
		this.sal = sal;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmp() {
		return emp;
	}
	public void setEmp(String emp) {
		this.emp = emp;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", emp=" + emp + ", sal=" + sal + "]";
	}
	 List<Emp> emps = new ArrayList<>();
	 public void addEmp(Emp e)
	 {
		 emps.add(e);
	 }

	
}
