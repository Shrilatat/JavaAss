package demo.sts.day5;

import java.util.Date;

public abstract class Employee {
	private int id;
	private static int maxId=0;
	private String name, phNum, emailId, dept, designation;
	private Date doj;
	public Employee(String name, String phNum, String emailId, String dept, String designation, Date doj) {
		this.name = name;
		this.phNum = phNum;
		this.emailId = emailId;
		this.dept = dept;
		this.designation = designation;
		this.doj = doj;
		this.id = ++maxId;
	}
	public abstract float calcSalary();
	
	public String displayEmpDetails() {
		return "Employee [id=" + id + ", name=" + name + ", phNum=" + phNum + ", emailId=" + emailId + ", dept=" + dept
				+ ", designation=" + designation + ", doj=" + doj + ", calcSalary()=" + calcSalary() + "]";
	}

	
}
