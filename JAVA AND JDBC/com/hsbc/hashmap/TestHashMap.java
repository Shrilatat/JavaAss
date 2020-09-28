package com.hsbc.hashmap;

public class TestHashMap {
	public static void main(String[] args) {
		Student dao = new Student();
		
		dao.setNames();
		
		dao.printNames();
		
		dao.printSize();
		
		dao.getName("4");
		
		dao.remove("2");
		
		dao.printNames();
	}
}
