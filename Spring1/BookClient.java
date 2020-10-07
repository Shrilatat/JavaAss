package com.trg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookClient {
	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Book b = ctx.getBean("bb" , Book.class);
		
		/*
		 * b.setBookId(222); b.setIsbn(111); b.setName("RRR"); b.setTitle("AAA");
		 */ 
		
		/*
		 * System.out.println(b.getBookId()); System.out.println(b.getIsbn());
		 * System.out.println(b.getName()); System.out.println(b.getTitle());
		 */
		System.out.println(b); 
		
		
		
	}

}
