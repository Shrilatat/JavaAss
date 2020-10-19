package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Employee {
	private int empid;
	private String empName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empName) {
		super();
		this.empid = empid;
		this.empName = empName;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	void addEmp(Employee e){
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + "]";
	}
	
}
