package com.trg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookClient {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("configbook.xml");
		Book book1=ctx.getBean("book1",Book.class);
		System.out.println(book1);
		
	}

}
