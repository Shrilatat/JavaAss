package com.hsbc.collectionsdemo;

public class ArrayListDemo  {

	public static void main(String[] args) {
		StudentOp obj = new StudentOp();
		obj.setNames();
		obj.addName("Geeta");
		obj.searchName("Aditi");
		obj.searchName(2);
		obj.removeName("Chaitra");
	}
}
