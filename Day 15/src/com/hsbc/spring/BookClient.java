package com.hsbc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookClient {

	public static void main(String[] args) {


		ApplicationContext ctx = new ClassPathXmlApplicationContext("configBook.xml");
		Book b = ctx.getBean("ab1", Book.class);
		System.out.println(b);
		
	}

}
