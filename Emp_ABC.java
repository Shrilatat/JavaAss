package com.Employee;

import java.sql.Date;

public abstract class Emp_ABC {
	
	private int id;
	private String name, email, ph, dept, desig;
	Date date;

	public Emp_ABC(int id, String name, String email, String ph, String dept, String desig, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.ph = ph;
		this.dept = dept;
		this.desig = desig;
		this.date = date;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void displayEmpDetails() {
		System.out.println("Emp_ABC [id=" + id + ", name=" + name + ", email=" + email + ", ph=" + ph + ", dept=" + dept
				+ ", desig=" + desig + ", date=" + date + "]");
	}

	abstract void calculateSalary();
}
