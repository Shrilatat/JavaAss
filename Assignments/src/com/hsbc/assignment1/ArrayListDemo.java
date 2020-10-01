package com.hsbc.assignment1;

//import com.hsbc.assignment1.StudentOps;
public class ArrayListDemo {
	
	public static void main(String[] args) {
	StudentOps op=new StudentOps();
	op.setNames();
	op.addName("Ritik");
	op.searchName("Sid");
	op.searchName(2);
	op.printNames();
	op.removeName("Ritik");
	op.printNames();
	}
}
