package com.hsbc;

import java.util.ArrayList;

public class StudentOp {
private ArrayList<String> ala=new ArrayList<>();
public void setNames() {
	ala.add("ABC");
	ala.add("EFG");
	ala.add("xyz");
}
public void addName(String str) {
	ala.add(str);
}
public void searchName(String str) {
	int a=0;
	for(String r:ala) {
		if(r.equals(str)) {
			System.out.println("Found the name");
			a=1;
			break;
		}
	}
	if(a==0)
	{
		System.out.println("Name not found");
	}
}
public void searchName(int index) {
	String d=ala.get(index);
	System.out.println(d);
}
public void printNames() {
	int a=ala.size();
	for(String b:ala) {
		System.out.println(b);
	}
}
public void removeName(String stuName) {
	ala.remove(stuName);
}
public static void main(String[] args) {
	StudentOp obj2=new StudentOp();
	obj2.setNames();
	obj2.setNames();
	obj2.searchName("ABC");
	obj2.searchName(1);
	obj2.printNames();
	obj2.removeName("xyz");
}
}
