package day6;

import java.util.List;

public interface BookDaoIntf {
	void addBook(Book book);
	void deleteBook(int bookid);
	void showAllBooks();
	Book getBookWithId(int bookid);
	Book[] getBookWithAuthor(String author);
	List<Book> getBooksContainingNames(String str);
	void applyDiscount(double discount);
}
