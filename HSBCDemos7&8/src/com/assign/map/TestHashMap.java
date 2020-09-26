package com.assign.map;

public class TestHashMap {
public static void main(String[] args) {
	Student obj = new Student();
	obj.setNames("101" , "aaa");
	obj.setNames("102" , "bbb");
	obj.setNames("103" , "ccc");
	obj.printNames();
	obj.getName("102");
	obj.printSize();
	obj.remove("102");
}
}
