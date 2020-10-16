package com.hsbc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CCClient {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		CurrencyConverter cc = ctx.getBean("cc", CurrencyConverter.class);
		
		System.out.println(cc.dollarsToRupees(100));
		
	}

}
