package com.hsbc;

public class Employee {

//	public Employee(int empId, int empName) {
//		super();
//		this.empId = empId;
//		this.empName = empName;
//	}
//	
	private int empId;
	private String empName;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) throws InvalidNameException {
		if (empName == null)
			throw new InvalidNameException("Emp name can't be null");
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

}
