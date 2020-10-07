package com.hsbc.jdbcEx2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BookClient {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bookconfig.xml");
		BookDao dao = ctx.getBean("bookDao",BookDao.class);
		
		System.out.println(dao.getAllBooks());
		System.out.println("---------------------");
		
		System.out.println(dao.getBookById(2));
		System.out.println(dao.getBooksByAuthor("ccc"));
		System.out.println(dao.getBooksByPubHouse("oreilly"));
		System.out.println(dao.getBooksContainingTitle("java"));
		System.out.println(dao.addBook(new Book(5,"pych","fff","manning",750)));
		System.out.println(dao.deleteBook(5));
		System.out.println(dao.increasePrice(new Book(1,"pych","fff","manning",750),40));
		System.out.println(dao.getAuthor(new Book(2,"pych","fff","manning",750)));
		dao.updateBatchPrice(dao.getAllBooks());
		System.out.println("---------------------");
		System.out.println(dao.getAllBooks());
		
		
	}

}
