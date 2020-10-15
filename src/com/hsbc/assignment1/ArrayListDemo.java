package com.hsbc.assignment1;
/**
 * 
 * @author suryavanshi
 *
 */

public class ArrayListDemo {
	public static void main(String[] args) {
		
		StudentOp op = new StudentOp();
		op.addName("Shubham");
		op.searchName("Rohan");
		op.searchName(2);
		op.printNames();
		op.removeName("Prajwal");
	}
}
