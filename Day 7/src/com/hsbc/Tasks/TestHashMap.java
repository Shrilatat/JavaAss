package com.hsbc.Tasks;

public class TestHashMap {

	public static void main(String[] args) {

		Student obj = new Student();

		obj.setNames();
		obj.printNames();
		obj.getNames("aaa");
		obj.printSize();
		obj.remove("aaa");
	}
}
