package com.hsbc.trg;

public class Emp {
	int empid;
	String ename;

	public Emp() {
	}

	public Emp(int empid, String ename) {
		super();
		this.empid = empid;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", ename=" + ename + "]";
	}

	public static void main() {
		Emp e1 = new Emp(101, "Amisha");
		System.out.println(e1);

	}

}
