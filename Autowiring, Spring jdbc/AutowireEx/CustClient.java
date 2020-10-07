package com.hsbc.AutowireEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CustClient {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("autowireConfig.xml");
		Customer d=ctx.getBean("cu",Customer.class);
		
		System.out.println(d);
	}

}
