package com.hsbc;

public class TestEmployee {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpId(1);
		try {
			employee.setEmpName("Abhishek");
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(employee);
	}
}
