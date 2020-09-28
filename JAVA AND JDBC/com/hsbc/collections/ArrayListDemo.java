package com.hsbc.collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentOp student = new StudentOp();
		
		student.setNames();
		student.addName("HSBC");
		student.addName("Bank");
		student.searchName("Vishnu");
		student.removeName("Gopal");
		student.searchName(2);
		student.printNames();
	}

}
