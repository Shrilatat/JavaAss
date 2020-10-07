package com.hsbc.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

public class HelloWorldClient {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("helloWorld.xml");
		
		HelloWorld bean = ctx.getBean("ab1", HelloWorld.class);
		bean.sayHello();
		
		ctx.registerShutdownHook();
		
	}

}
