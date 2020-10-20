package com.assign.book;

import java.util.TreeSet;

public class TestBookOp {
	
	public static void main(String[] args) {
		TreeSet<Book> books = new TreeSet<Book>(); 
	    books.add(new Book(1, "aaa", "a", 100)); 
        books.add(new Book(2, "bbb", "b", 200)); 
        books.add(new Book(3, "ccc", "c", 300)); 
         
        BookDaoImpl obj = new BookDaoImpl();
        obj.addBook(new Book(4 , "ddd" , "d" , 400));
        obj.deleteBook(1);
    	obj.showAllBooks();
    	Book b = obj.getBookWithId(2);
    	obj.applyDiscount(50);
        

	}

	
	

}
