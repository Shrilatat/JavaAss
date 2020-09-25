package com.hsbc.collection;

public class ArrayListDemo {
	public static void main(String[] args) {
		StudentOp stuName = new StudentOp();
		stuName.setNames();
		stuName.addNames("Mauli");
		stuName.printNames();
		stuName.removeName("a");
		stuName.searchName("hhhh");
		stuName.searchName("b");
}
}