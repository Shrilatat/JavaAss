package com.trg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookClient2 {
	
	
	public static void main(String[] args) {

		  ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		  Book2 bookc = ctx.getBean("bookc" , Book2.class);
		  System.out.println(bookc);
	}

}
