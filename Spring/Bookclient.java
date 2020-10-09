package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bookclient {
public static void main(String[] args) {
	

		ApplicationContext ctx=new ClassPathXmlApplicationContext("book.xml");
		Bookmanager manager=ctx.getBean("manager", Bookmanager.class);
		System.out.println(manager.getBooklist()); 
		System.out.println(manager.getBookWithID(1)); 
		System.out.println(manager.getAllBooksByAuthor("Auth1")); 

	
}
}
