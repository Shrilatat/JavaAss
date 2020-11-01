package Day4;

import java.util.List;

public class BookClient {
	
	public static void main(String[] args) {
		Book A = new Book(1, "HGTG", "me", 101.52);
		Book B = new Book(2, "New Book", "not me", 202.52);
		Book C = new Book(3, "Harry Potter", "JK", 303.52);
		
		BookDao record = new BookDao();
		record.add_book(A);
		record.add_book(B);
		record.add_book(C);
		
		List<Book> temp = record.get_all_books();
		for (Book b : temp)
			System.out.println(b);
		System.out.println("--------------------");
		record.update_book(1, 105.54);
		Book b = record.bookbyid(1);
		System.out.println(b);
		System.out.println("--------------------");
		record.delete_book(1);
		temp = record.get_all_books();
		for (Book b1 : temp)
			System.out.println(b1);	
	}
}