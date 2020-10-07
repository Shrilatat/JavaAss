package com.hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookManagerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bookconfig3.xml");
		BookManager bm = ctx.getBean("bm" , BookManager.class);
		
		System.out.println(bm.getBooks());
		System.out.println("-------------------------------------------");
		System.out.println(bm.getAllBooksByAuthorLastName("BBB"));
		System.out.println("-------------------------------------------");
		System.out.println(bm.getBookWithId(102));

	}

}
