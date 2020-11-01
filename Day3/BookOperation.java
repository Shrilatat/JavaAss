package Day3Ass;

import java.util.HashSet;
import java.util.Iterator;

public class BookOperation {
	
	private HashSet<Book> db = new HashSet<Book>();
	
	void addBook(Book book) {
		db.add(book);
	}
	public void showBook() {
		for (Book i : db)
			System.out.println(i);
	}

	public void deleteBook(int bookid) {

		Iterator<Book> i = db.iterator();
		while (i.hasNext()) {
			Book b = i.next();
			if (b.getBookId() == bookid)
				i.remove();
		}
	}

	public Book getBookWithId(int bookid) {
		Book temp = new Book();
		for (Book b : db) {
			if (b.getBookId() == bookid)
				temp = b;
		}
		return temp;
	}

	public Book[] getBookWithAuthor(String autName) {
		Book[] Books = new Book[db.size()];
		int count = 0;
		for (Book i : db) {
			if (i.getAuthor().equals(autName)) {
				Books[count] = i;
				count++;
			}
		}
		//System.out.println(count);
		return Books;
	}

}
