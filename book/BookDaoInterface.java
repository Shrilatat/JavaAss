package book;

import java.util.List;

public interface BookDaoInterface {
	public void addBook(Book book);
	public void deleteBook(int bookId) throws Exception;
	public void showAllBooks();
	public Book getBookWithId(int bookId) throws Exception;
	public Book[] getBookWithAuthor(String author);
	public List<Book> getBooksContainingName(String str);
	public void applyDiscount(double discount);
}
