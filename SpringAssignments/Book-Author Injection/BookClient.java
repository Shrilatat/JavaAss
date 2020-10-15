package com.trg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookClient {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("configbook.xml");
		Book book = (Book) ctx.getBean("book");
		System.out.println(book);
		

	}

}
