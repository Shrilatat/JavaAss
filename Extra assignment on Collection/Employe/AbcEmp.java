package com.hsbc.AssignCollect;

import java.util.Date;

public abstract class AbcEmp {
    
	int id ;
	String name;
	int pno ;
	String email ;
	String dept ;
	String designation ;
	Date date ;
	
	public AbcEmp() {
		super();
	}
    
    
	
	public AbcEmp(int id, String name, int pno, String email, String dept, String designation, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.pno = pno;
		this.email = email;
		this.dept = dept;
		this.designation = designation;
		this.date = date;
	}
    
	


	
	public String despDetails (){
		return "AbcEmp [id=" + id + ", name=" + name + ", pno=" + pno + ", email=" + email + ", dept=" + dept
				+ ", designation=" + designation + ", date=" + date + "]";
	}



	public abstract void calcSal(); 
	
	
}
