package demo.sts.day3;

import java.util.*;

public class BookOperation {
	private Set<Book> books;

	public BookOperation() {
		this.books = new HashSet<>();
	}

	public void addBook(Book book) {
		books.add(book);
	}
	
	public Book getBookbyId(int bookId) throws Exception {
		for (Book bk : books) {
			if (bk.getId() == bookId)
				return bk;
		}
		throw new Exception("Book not Found!");
	}
	
	public void deleteBook(int bookId) {
		

	}
}
