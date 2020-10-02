package com.hsbc.problem3;

public class TestHashMap {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.setNames(1, "ujjwal");
		obj.setNames(2, "param");
		obj.setNames(3, "vaibhav");
		obj.setNames(4, "vishal");
		
		obj.printSize();
		obj.getName(1);
		obj.remove(1);
		obj.printNames();

	}

}
