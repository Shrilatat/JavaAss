package com.hsbc.assignment5;

public class StudOps {

	public static void main(String[] args) {

		Student student = new Student();
		try {
			student.setNames();
			student.printNames();
			student.getName("ABC");
			student.printSize();
			student.remove(2);
			student.printNames();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
