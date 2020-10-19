package com.hsbc.assignments;

import java.util.TreeSet;

public class TestBookOp {
	
	public static void main(String[] args) {
//		TreeSet<Book> set=new TreeSet<>();
//		set.add(new Book(1,"play","Sid",700));
//		set.add(new Book(2,"work","ddd",900));
//		
		BookDao any=new BookDao();
		Book b=new 	Book(1,"play","Sid",700);
		any.addBook(new Book(1,"play","Sid",700));
	//	any.addBook(new Book(2,"work","ddd",900));
		
		
	}
}
