package com.hsbc.assignment2;

public class Emp {
	
	private int empno, sal;
	private String empName, designation;
	/**
	 * 
	 */
	public Emp() {
		super();
	}
	/**
	 * @param empno
	 * @param sal
	 * @param empName
	 * @param designation
	 */
	public Emp(int empno, int sal, String empName, String designation) {
		super();
		this.empno = empno;
		this.sal = sal;
		this.empName = empName;
		this.designation = designation;
	}
	/**
	 * @return the empno
	 */
	public int getEmpno() {
		return empno;
	}
	/**
	 * @param empno the empno to set
	 */
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	/**
	 * @return the sal
	 */
	public int getSal() {
		return sal;
	}
	/**
	 * @param sal the sal to set
	 */
	public void setSal(int sal) {
		this.sal = sal;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", sal=" + sal + ", empName=" + empName + ", designation=" + designation + "]";
	}

	
}
