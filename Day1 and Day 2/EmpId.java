package com.trg;

public class EmpId {
	private int id = 1;
	private String ename;
	private double sal;
	
	static int count=0;
	
	public EmpId() {
		id=count++;
	}
	public EmpId(String ename) {
		id=count++;
		this.ename = ename;
	}
	public EmpId(String ename, double sal) {
		id=count++;
		this.ename = ename;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Empl [id=" + id + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	public static void main(String[] args) {
		EmpId e1 = new EmpId();
		EmpId e2 = new EmpId("Rama");
		EmpId e3 = new EmpId("Krishna", 50000);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
	}
}
