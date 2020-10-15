package com.hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Book Client calls performs all the operations
 * @author suryavanshi
 *
 */

public class BookClient {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		BookDao dao = ctx.getBean("bookDao",BookDao.class);

		System.out.println(dao.getAllBooks());

		System.out.println(dao.getBookById(102));
		System.out.println(dao.getBooksByAuthor("Steve"));
		System.out.println("Books with publication oreilly \n" + dao.getBooksByPublication("oreilly"));
		System.out.println("Book with title containing java \n " + dao.getBooksContainingTitle("java"));
		
		dao.addBook(new Book(103,"Head First Java","Clarke","manning",1000));
		System.out.println("New Book Added \n" + dao.getAllBooks());
		
		dao.deleteBook(102);
		System.out.println("Book Deleted with id 102\n" + dao.getAllBooks());
		
		dao.increasePrice(new Book(101,"Free Thoughts","Adam","manning",300),50);
		System.out.println(dao.getAllBooks());

//		System.out.println(dao.getAuthor(new Book(102,"Spring in Action","Steve","manning",1000)));
		dao.updateBatchPrice(dao.getAllBooks());
		System.out.println(dao.getAllBooks());


	}

}