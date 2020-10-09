package com.hsbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookClient {

	public static void main(String[] args) {

		Employee e = new Employee();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dnconn.xml");
		BookDao dao = ctx.getBean("bookDao", BookDao.class);
		int a = dao.addBook(new Book(103, "Abhi", "APC", "Java", 900));
		if (a > 0)
			System.out.println("added");

		List<Book> list = dao.getAllbooks();
		System.out.println(list);
		Book b = dao.getBooksById(101);
		System.out.println(b);

		List<Book> book = dao.getBooksByAuthor("Abhinav");
		System.out.println(book);

		List<Book> list2 = dao.getBooksByPuBhouse("APC");
		System.out.println(list2);

		int i = dao.deleteBook(100);
		if (i > 0)
			System.out.println("Deleted");
		int j = dao.increasePrice(new Book(103, "Abhi", "APC", "Java", 900), 1000);
		if (j > 0)
			System.out.println("PRICE INCREASED");

		List<Book> l = new ArrayList<Book>();
		l.add(new Book(103, "Abhi", "APC", "Java", 900));
		int k = dao.updatepriceAsBatch(l);
		if (k > 0)
			System.out.println("Updated");
	}
}