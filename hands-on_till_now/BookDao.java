package day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class BookDao implements BookDaoIntf {
	TreeSet<Book> booksList = new TreeSet<>();
	
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		booksList.add(book);
	}

	@Override
	public void deleteBook(int bookid) {
		// TODO Auto-generated method stub
		Iterator<Book> iter = booksList.iterator();
		while(iter.hasNext()) {
			Book temp = iter.next();
			if (temp.getBookId()==bookid) {
				iter.remove();
				System.out.println("Book with given id removed..");
				return;
			}
		}
		System.out.println("No book found...");
	}

	@Override
	public void showAllBooks() {
		Iterator<Book> iter = booksList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

	@Override
	public Book getBookWithId(int bookid) {
		Iterator<Book> iter = booksList.iterator();
		while(iter.hasNext()) {
			Book temp = iter.next();
			if(temp.getBookId()==bookid) {
				return temp;
			}
		}
		return null;
	}

	@Override
	public Book[] getBookWithAuthor(String author) {
		Iterator<Book> iter = booksList.iterator();
		Book[] book_by_author = new Book[booksList.size()];
		
		return null;
	}

	@Override
	public List<Book> getBooksContainingNames(String str) {
		Iterator<Book> iter = booksList.iterator();
		List<Book> books = new ArrayList<Book>();
		while(iter.hasNext()) {
			Book temp = iter.next();
			if (temp.getBname().contains(str)) {
				books.add(temp);
			}
		}
		return books;
		
	}

	@Override
	public void applyDiscount(double discount) {
		Iterator<Book> iter = booksList.iterator();
		while(iter.hasNext()) {
			Book temp = iter.next();
			double price = temp.getPrice();
			temp.setPrice(price-discount);
		}

	}

}
