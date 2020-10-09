package com.hsbc.emp;

public class EmpBean {

	int empId, empSal;
	String empName, empDept;

	public EmpBean() {
		super();

	}
	public EmpBean(int empId, int empSal, String empName, String empDept) {
		super();
		this.empId = empId;
		this.empSal = empSal;
		this.empName = empName;
		this.empDept = empDept;
	}


	public int getempId() {
		return empId;
	}

	public void setempId(int empId) {
		this.empId = empId;
	}

	public int getempSal() {
		return empSal;
	}

	public void setempSal(int empSal) {
		this.empSal = empSal;
	}

	public String getempName() {
		return empName;
	}

	public void setempName(String empName) {
		this.empName = empName;
	}

	public String getempDept() {
		return empDept;
	}

	public void setempDept(String empDept) {
		this.empDept = empDept;
	}


	@Override
	public String toString() {
		return "EmpBean [empId=" + empId + ", empSal=" + empSal + ", empName=" + empName + ", empDept=" + empDept + "]";
	}

}