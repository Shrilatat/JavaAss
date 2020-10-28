package JavaAss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class bookOps {

	private HashMap<Integer, Book> dataHashMap = new HashMap<Integer, Book>();

	public void addBook(Book book) {
		dataHashMap.put(book.getBookNo(), book);
	}

	public void delBook(int bookId) {
		dataHashMap.remove(bookId);
	}

	public void showAll() {
		Set<Integer> keys = dataHashMap.keySet();

		for (int k : keys) {
			System.out.println(dataHashMap.get(k));
		}

	}
	
	public Book getBook(int id) {
		return dataHashMap.get(id);
	}
	
	public Book[] getBookWithAuthor(String auth) {
		
		ArrayList<Book> books = new ArrayList<Book>();
		
		Set<Integer> keys = dataHashMap.keySet();

		for (int k : keys) {
			Book book = dataHashMap.get(k);
			if(book.getAuth().equals(auth)) {
				books.add(book);
			}
			
		}
		Book[] returnBooksArray = books.toArray(new Book[books.size()]);
		return returnBooksArray;
	}

	public static void main(String[] args) {
		Book b1 = new Book(1, "b11", "chirag", 10);
		Book b2 = new Book(2, "b21", "b211", 20);
		Book b3 = new Book(3, "b31", "chirag", 30);

		bookOps bookOps = new bookOps();
		
		bookOps.addBook(b1);
		bookOps.addBook(b2);
		bookOps.addBook(b3);
	Book[] books = 	bookOps.getBookWithAuthor("chirag");
	for(Book b:books) {
		System.out.println(b);
	}

	}

}
