package com.hsbc.collections;

public class StudentMain {

	public static void main(String[] args) {

		StudentOp obj = new StudentOp();

		obj.setNames();
		obj.addNames("Smriti");
		obj.searchNames("Amisha");
		obj.searchNames(1);
		obj.printNames();
		obj.removeNames("Smriti");

	}

}
