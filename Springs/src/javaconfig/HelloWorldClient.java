package javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldClient {
	ApplicationContext ctx= new AnnotationConfigApplicationContext(MyConfig.class);
	
	HelloWorld bean=ctx.getBean("helloWorld",HelloWorld.class);
}
