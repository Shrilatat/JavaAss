package com.hsbc.assignment4;

public class TestBookOp {

		public static void main(String[] args) {
			
			BookOperation bk=new BookOperation();
			bk.addBook(new Book(1,"Java","Sid",3000));
			bk.addBook(new Book(2,"c","Aditya",2000));
			bk.addBook(new Book(3,"c++","bo",4000));
			bk.addBook(new Book(4,"Advanced Java","Sid",5000));
			bk.showAllBooks();
			System.out.println("----");
			
			bk.deleteBook(2);
			bk.showAllBooks();
			System.out.println("----");
			
			Book book1=bk.getBookWithId(1);
			System.out.println(book1);
			System.out.println("----");
			
			Book[] book2=bk.gotBookWithAuthor("Sid");
			for (Book book3 : book2) {
				System.out.println(book3);
			}
			System.out.println("----");
			
			bk.applyDiscount(500);
			
	}
}
