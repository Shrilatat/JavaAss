package com.trg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookClient {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("configbook.xml");
		BookManager bookManager=ctx.getBean("bookManager", BookManager.class);
		System.out.println("All Books:");
		System.out.println(bookManager.getBooks()); 
		System.out.println("Book with ID 102:");
		System.out.println(bookManager.getBookWithId(102));
		System.out.println("Books with Author Name Kanetkar:");
		System.out.println(bookManager.getBooksByAuthorName("Kanetkar")); 

	}

}
