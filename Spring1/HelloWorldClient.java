package com.trg;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloWorldClient {
	
	public static void main(String[] args) {
		//HelloWorld hw = new HelloWorld();
		//hw.sayHello();
		
		Resource resource = new ClassPathResource("helloworld.xml");
		
		/*
		 * BeanFactory factory = new XmlBeanFactory(resource); HelloWorld bean =
		 * factory.getBean("hw" , HelloWorld.class); bean.sayHello();
		 */
		
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		HelloWorld bean = ctx.getBean("hw" , HelloWorld.class);
		bean.sayHello();
		ctx.registerShutdownHook();
		
		
	}

}
