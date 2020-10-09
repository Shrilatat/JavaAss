package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloWorldClient {
	public static void main(String[] args) {
		/*
		 * helloworld hw=new helloworld(); hw.sayHello();
		 */
		// Resource resource=new ClassPathResource("helloworld.xml");

		// BeanFactory factory=new XmlBeanFactory(resource);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("helloworld.xml");
		helloworld bean = ctx.getBean("hw", helloworld.class);
		bean.sayHello();
	}
}
