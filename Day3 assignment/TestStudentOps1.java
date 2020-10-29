package com.hsbc.collection;

public class TestStudentOps1 {

	public static void main(String[] args) {
		
		StudentOps1 stu = new StudentOps1();
		
		stu.setStudNames("1", "rahul");
		stu.setStudNames("2", "akhil");
		stu.setStudNames("3", "abhi");
		stu.setStudNames("4", "ram");
		stu.setStudNames("5", "shyam");
		
		stu.printNames();
		
		stu.getName("4");
		stu.getName("1");
		
		stu.printSize();
		
		stu.remove("3");
		
		stu.printNames();

	}
}
