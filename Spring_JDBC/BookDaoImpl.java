package com.hsbc;

import java.util.List;
/**
 * 
 * @author Abhinav Srivastava
 *
 */
public interface BookDaoImpl {

	List<Book> getAllbooks();
	Book getBooksById(int bID);
	List<Book> getBooksByAuthor(String bAuthor);
	List<Book> getBooksByPuBhouse(String bPublication);
	List<Book> getBookscontainingTitle(String bName);
	int addBook(Book book);
	int deleteBook(int bID);
	int increasePrice(Book book,int bPrice);
	int updatepriceAsBatch(List<Book> book);
	
}
