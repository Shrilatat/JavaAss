package com.hsbc.Tasks;

import java.util.*;

public class TestBookOp {
	public static void main(String[] args) {

		BookDaoIntf obj = new BookDao();

		obj.addBook(new Book(111, "CS with Java", "Sumita Arora", 500.00));
		obj.addBook(new Book(112, "Java for beginners", "Amisha", 1000.00));
		obj.addBook(new Book(113, "C for beginners", "Aditi", 200.00));
		obj.addBook(new Book(114, "C++ for beginners", "Mauli", 300.00));
		obj.addBook(new Book(115, "Python for beginners", "Parth", 750.00));

		obj.deleteBook(112);

		obj.showAllBooks();

		Book b1 = obj.getBookWithId(111);
		System.out.println(b1);

		List<Book> b2 = obj.getBooksContainingName("Java");
		System.out.println(b2);

		Book[] b3 = obj.getBookwithAuthor("Sumita Arora");
		for (int i = 0; i < b3.length; i++)
			System.out.println(b3[i]);

		obj.applyDiscount(150.00);
	}

}
