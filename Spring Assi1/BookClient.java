package com.hsbc.book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookClient {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bookmanager.xml");
		BookManager manager=ctx.getBean("manager", BookManager.class);
		System.out.println(manager.getBooks()); 
		System.out.println("Book with ID 102:");
		System.out.println(manager.getBookWithId(102));
		System.out.println("Book with Author Name Kanetkar:");
		System.out.println(manager.getBooksByAuthorName("Kanetkar")); 
	}
}
