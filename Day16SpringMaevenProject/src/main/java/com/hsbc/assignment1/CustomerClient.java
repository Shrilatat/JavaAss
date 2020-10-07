package com.hsbc.assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerClient {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("CustomerConfig.xml");
		CustomerDetails obj = ctx.getBean("cusdetObj", CustomerDetails.class);

		System.out.println(obj);
	}

}