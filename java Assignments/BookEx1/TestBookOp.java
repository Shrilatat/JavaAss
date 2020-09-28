package com.hsbc.BookEx;

import java.util.List;

public class TestBookOp {
	public static void main(String[] args) {
		BookDaoIntf blist = new BookDao();
		blist.addBook(new Book(1, "core java", "aaa", 1000));
		blist.addBook(new Book(2, "java programing", "aaa", 2000));
		blist.addBook(new Book(3, "Advanced java", "bbb", 1500));
		blist.addBook(new Book(4, "Let us c", "ccc", 500));
		System.out.println("----------");
		blist.deleteBook(1);
		blist.showAllBooks();
		System.out.println("---------");

		Book b = blist.getBookWithId(3);
		System.out.println(b);
		System.out.println("----------");

		List<Book> bb = blist.getBookContainingName("java");
		System.out.println(bb);

		Book[] bb2 = blist.getBookWithAuthor("bbb");
		System.out.println(bb2);

		System.out.println("--------");
		blist.applyDiscount(150);

	}

}
