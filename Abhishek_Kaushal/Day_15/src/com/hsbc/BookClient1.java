package com.hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookClient1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bookconfig1.xml");
		Book1 book1 = ctx.getBean("book1" , Book1.class);
		
		System.out.println(book1);

	}

}
