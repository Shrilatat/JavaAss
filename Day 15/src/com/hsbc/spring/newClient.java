package com.hsbc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class newClient {

public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("new.xml");
		BookBean bb = ctx.getBean("bb", BookBean.class);
		System.out.println(bb);
		
	}
}
