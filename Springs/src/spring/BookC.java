package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookC {
	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("bookx.xml");
		Books bx=ctx.getBean("bx",Books.class);
		
		/*
		 * bx.setBookID(12); bx.setBooktitle("Java"); bx.setAuthName("ABCS");
		 * bx.setIsbnno(123456); bx.setPublication("McGrawHill"); bx.setPrice(450);
		 */ 
		 System.out.println(bx.getBookID()); System.out.println(bx.getBooktitle());
		  System.out.println(bx.getAuthName()); System.out.println(bx.getIsbnno());
		  System.out.println(bx.getPublication()); System.out.println(bx.getPrice());
		 System.out.println(bx.toString());

	}
}
