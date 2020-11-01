package com.hsbc.collection_Assignment;

public abstract class Emp_ABC {

	private int id,ph;
	private String name,email,dept,desig;
	Date doj;
	
	 public Emp_ABC(int id, int ph, String name, String email, String dept, String desig, Date doj) {
		super();
		this.id = id;
		this.ph = ph;
		this.name = name;
		this.email = email;
		this.dept = dept;
		this.desig = desig;
		this.doj = doj;
	}

	public void DispDetails() {
		System.out.println( "Emp_ABC [id=" + id + ", ph=" + ph + ", name=" + name + ", email=" + email + ", dept=" + dept
				+ ", desig=" + desig + ", doj=" + doj + "]");
	}

	abstract void CalSal();

	public String getName() {
		return name;
	}

	
	
}
