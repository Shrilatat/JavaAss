package com.hsbc.problem4;
import java.util.List;

public class TestBookOp {

	public static void main(String[] args) {
		BookDaoIntf obj = new BookDao();
		
		obj.addBoook(new Book(1,"learn c++" , "a",1000));
		obj.addBoook(new Book(2,"learn java" , "b",2000));
		obj.addBoook(new Book(3,"learn python" , "c",3000));
		obj.addBoook(new Book(4,"learn js" , "d",4000));
		
		System.out.println("------------------");
		obj.deleteBook(1);
		obj.showAllBooks();
		
		System.out.println("---------------------");
		Book b = obj.getBookWithId(2);
		System.out.println(b);
		
		System.out.println("----------------");
		Book objb[] = obj.getBookWithAuthor("b");
		for(Book bj : objb) {
			System.out.println(bj);
		}
		
		System.out.println("-------------");
		List<Book> objlist = obj.getBooksContainingName("learn python");
		for(Book check : objlist)
				System.out.println(check);
		obj.applyDiscount(10);
		System.out.println("-------------");
		obj.showAllBooks();
		
		

	}

}
