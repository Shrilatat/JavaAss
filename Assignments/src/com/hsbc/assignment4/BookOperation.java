/**
 * 
 */
package com.hsbc.assignment4;

import java.util.*;

/**
 * @author admin
 *
 */
public class BookOperation {
	TreeSet<Book> book=new TreeSet<>();
	public void addBook(Book b)
	{
		book.add(b);
	}
	
	public void deleteBook(int id)
	{
		for (Book book2 : book) {
			if(book2.getBookid()==id)
			{
				book.remove(book2);
				return;
			}
		}
		System.out.println("Book not in set");
	}
	
	public void showAllBooks()
	{
		for (Iterator iterator = book.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			System.out.println(book);
		}
	}
	
	
	
	public Book getBookWithId(int bookId) {
		
		Book temp = new Book();
		for (Iterator iterator = book.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			if(book.getBookid() == bookId){
				temp = book;
				break;
		}
			else
				temp = null;
		}
		return temp;
	}
//

	public Book[] gotBookWithAuthor(String author) {
		List<Book> temp = new ArrayList<>();
		int i = 0;
		for (Iterator iterator = book.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			if(book.getAuthor().equals(author)){
				temp.add(book);
			}
		}
		Book[] res = new Book[temp.size()];
		res = temp.toArray(res);
		return res;
	}

	public void applyDiscount(double discount) {
		
		double tempDiscount = 0;
		for (Iterator iterator = book.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			tempDiscount = book.getPrice() - discount;
			book.setPrice(tempDiscount);
		}
		
		for (Book book : book) {
			System.out.println(book);
		}
	}
	
	
	
	
	
}
