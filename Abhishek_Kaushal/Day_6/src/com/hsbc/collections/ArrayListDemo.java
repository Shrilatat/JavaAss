package com.hsbc.collections;

import com.hsbc.collections.assignment.StudentOp;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentOp stuOp = new StudentOp();
		stuOp.setNames();
		stuOp.addName("Smriti");
		stuOp.searchName("Abhishek");
		stuOp.searchName(2);
		stuOp.printNames();
		stuOp.removeName("Ujjwal");

	}

}
