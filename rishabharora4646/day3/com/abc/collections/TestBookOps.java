package com.abc.collections;

public class TestBookOps {
	public static void main(String[] args) {
		BookOps bop1 = new BookOps();
		bop1.addBook(new Book(1,"Book1","auth1",45));
		bop1.addBook(new Book(2,"Book2","auth1",45));
		bop1.addBook(new Book(3,"Book3","auth1",45));
		bop1.addBook(new Book(4,"Book4","auth2",45));
		bop1.addBook(new Book(5,"Book5","auth3",45));
		bop1.addBook(new Book(6,"Book6","auth4",45));
		bop1.addBook(new Book(7,"Book7","auth5",45));
		bop1.addBook(new Book(8,"Book8","auth6",45));
		bop1.deleteBook(7);
		System.out.println(bop1.getBookWithId(8));
		Book[] booksWithAuthor = bop1.getBookWithAuthor("auth1");
		System.out.println("Books with Author");
		for(Book b : booksWithAuthor)
			System.out.println(b);
		System.out.println("All Books");
		bop1.showBooks();
	}
}
