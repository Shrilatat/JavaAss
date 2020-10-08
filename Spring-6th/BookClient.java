package com.hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookClient {
public static void main(String[] args)

{
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("Book.xml");
	BookManager bmanager=ctx.getBean("bookmanager", BookManager.class);
	System.out.println(bmanager.getBlist()); 
	System.out.println(bmanager.getBookWithID(101)); 
	System.out.println(bmanager.getAllBooksByAuthor("check")); 
	
}

}
