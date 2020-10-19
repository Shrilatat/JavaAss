package com.hsbc.problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class BookDao implements BookDaoIntf {

	private TreeSet<Book> book = new TreeSet<>();
	
	@Override
	public void addBoook(Book book) {
		this.book.add(book);		
	}

	@Override
	public void deleteBook(int bookid) {
		int f=0;
		for (Book b : book) {
			if(bookid==b.getBookId()) {
				book.remove(b);
				f=1;
				break;
			}
		}
		if(f==0)
			System.out.println("Book id not found");
	}

	@Override
	public void showAllBooks() {
		for(Book b : book) {
			System.out.println(b);
		}
		
	}

	@Override
	public Book getBookWithId(int bookid) {
		
		for(Book b : book) {
			if(bookid==b.getBookId())
				return b;
		}
		System.out.println("Book Not found");
		return null;
		
	}

	@Override
	public Book[] getBookWithAuthor(String author) {
		List<Book> bt = new ArrayList<>();
		for(Book b : book) {
			if(author.equals(b.getAuthor()))
				bt.add(b);
		}
		Book[] ans = new Book[bt.size()];
		bt.toArray(ans);
		return ans;
	}

	@Override
	public List<Book> getBooksContainingName(String str) {
		List<Book> bt = new ArrayList<>();
		
		for(Book b : book) {
			if(str.equals(b.getBname()))
				bt.add(b);
		}
		
		return bt;
	}

	@Override
	public void applyDiscount(double discount) {
		for(Book b : book) {
			b.setPrice(b.getPrice() - ( ( b.getPrice()*discount)/100 )  );
		}
		
	}
		
}
