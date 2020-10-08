package com.hsbc;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
	
	List<Book1> books;
	
	public void setBooks(List<Book1> books)
	{
		this.books = books;
	}
	
	public List<Book1> getBooks()
	{
		return books;
	}
	
	public List<Book1> getAllBooksByAuthorLastName(String lastName)
	{
		List<Book1> res = new ArrayList<>();
		for(Book1 b : books)
		{
			if(b.getAuthor().getLname().equals(lastName))
			{
				res.add(b);
			}
		}
		return res;
	}
	
	public Book1 getBookWithId(int id)
	{
		for(Book1 b:books)
		{
			if(b.getBookId() == id)
			{
				return b;
			}
		}
		return null;
	}

}
