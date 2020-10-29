package com.hsbc.Day3Ass;

public class TestStudentOps {
	public static void main(String[] args) {
		
		StudentOps students = new StudentOps();
		
		students.setNames("Roll1", "Student1");
		students.setNames("Roll2", "Student2");
		students.setNames("Roll3", "Student3");
		students.setNames("Roll4", "Student4");
		students.setNames("Roll5", "Student5");

		students.printNames();
		
		students.getName("Roll3");
		
		students.printSize();
		
		students.remove("Roll4");
		
	}
}
