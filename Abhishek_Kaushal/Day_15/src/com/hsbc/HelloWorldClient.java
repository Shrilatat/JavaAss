package com.hsbc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloWorldClient {
	
	public static void main(String[] args) {
//		HelloWorld hw = new HelloWorld();
//		hw.sayHello();
		
//		Resource resource = new ClassPathResource("helloworld.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("helloworld.xml");
		HelloWorld bean = ctx.getBean("hw", HelloWorld.class);
		bean.sayHello();
	}

}
