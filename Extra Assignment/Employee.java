package com.demo;

public abstract class Employee {
	private int id;
	private String name, pNo, email, dept, desig;
	private Date doj;
	public Employee(int id, String name, String pNo, String email, String dept, String desig, Date doj) {
		super();
		this.id = id;
		this.name = name;
		this.pNo = pNo;
		this.email = email;
		this.dept = dept;
		this.desig = desig;
		this.doj = doj;
	}

	public void displayEmpDetails() {
		System.out.println("Employee [id=" + id + ", name=" + name + ", pNo=" + pNo + ", email=" + email + ", dept=" + dept
				+ ", desig=" + desig + ", doj=" + doj + "]");
	}
	
	abstract public void calSal();
}
