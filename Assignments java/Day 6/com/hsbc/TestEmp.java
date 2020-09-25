package com.hsbc;

public class TestEmp {
	public static void main(String[] args) {
		Emp e1 =new Emp();

		e1.setEmpid(101);
		try {
			e1.setEname(null);
		} catch (InvalidNameException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
