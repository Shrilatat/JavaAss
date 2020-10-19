package com.hsbc.Assignment;

import java.util.*;

public class TestBookOp {
	public static void main(String[] args) {
		BookDao test = new BookDao();
		test.addBook(new Book(1, "JAVA", "Vishnu", 100));
		test.addBook(new Book(2, "C++", "Divya", 200));
		test.addBook(new Book(3, "Advanced", "aaa", 10000));

		System.out.println("-------------------------------------");

		test.showAllBooks();

		System.out.println("-------------------------------------");

		Book b = test.getBookWithId(1);

		System.out.println("-------------------------------------");

		Book[] temp = test.gotBookWithAuthor("Vishnu");

		for (Book book : temp) {
			System.out.println(book);
		}

		System.out.println("-------------------------------------");

		List<Book> temp1 = test.getBooksContainingName("C++");

		System.out.println(temp1);

		System.out.println("-------------------------------------");

		test.applyDiscount(50);

	}
}
