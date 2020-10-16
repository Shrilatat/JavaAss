package com.hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldClient {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("helloworld.xml");
		HelloWorld bean = ctx.getBean("hw",HelloWorld.class);
		bean.sayHello();
	}
}
