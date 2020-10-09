package com.trg.bookAuthor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookAuthorClient {
public static void main(String[] args) {
	//CurrencyConverter cc=new CurrencyConverter();
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("config4.xml");
	BookAuthor ba=ctx.getBean("ba",BookAuthor.class);
	System.out.println(ba);  //setterinjection
}/*
	 * Application Context java io=next.set Applicatio
	 */
}
