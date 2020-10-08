package com.trg.eg;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookClient {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("bookauth.xml");
		
		Book bk=ctx.getBean("book",Book.class);

		System.out.println(bk);//Setter injection
		
		
//		ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
//		CurrencyConverter cc=ctx.getBean("cc",CurrencyConverter.class);
//		cc.exchRate=(74.0);
//		System.out.println(cc.dollarsToRs(100));//Setter injection
	}

}

//<property name="bookId" value="1"/>
//<property name="price" value="1000"/>
//<property name="bookTitle" value="java"/>
//<property name="authorName" value="sid"/>
//<property name="publicationHouse" value="abc"/>