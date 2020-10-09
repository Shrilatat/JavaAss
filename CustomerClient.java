package com.hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerClient {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("customerconfig.xml");
		Customer c = ctx.getBean("customer", Customer.class);
		System.out.println(c);
	}

}
