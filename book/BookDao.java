package book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class BookDao implements BookDaoInterface{

	TreeSet<Book> myBooks = new TreeSet<Book>();

	@Override
	public void addBook(Book book) {
		myBooks.add(book);
	}

	@Override
	public void deleteBook(int bookId) throws Exception {
		Iterator<Book> it = myBooks.iterator();
		boolean bookRemoved = false;
		while(it.hasNext()) {
			if(it.next().getBookId() == bookId){
				bookRemoved = true;
				myBooks.remove(it.next());
			}
		}
		if(bookRemoved = false) {
			throw new Exception("Book does not exist");
		}
	}

	@Override
	public void showAllBooks() {
		Iterator<Book> it = myBooks.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

	@Override
	public Book getBookWithId(int bookId) throws Exception {
		Iterator<Book> it = myBooks.iterator();
		Book neededBook = null;
		boolean bookFound = false;
		while (it.hasNext()) {
			if(it.next().getBookId() == bookId) {
				neededBook = (Book) it;
				bookFound = true;
			}
		}
		
		if(!bookFound) {
			throw new Exception("Book Not Found!!!");
		}
		return neededBook;
	}

	@Override
	public Book[] getBookWithAuthor(String author) {
		ArrayList<Book> theseBooks = new ArrayList<Book>();

		Iterator<Book> it = myBooks.iterator();
		while (it.hasNext()) {
			if (it.next().getAuthor().equals(author)) {
				theseBooks.add(it.next());
			}
		}
		Object[] finalArray = theseBooks.toArray();
		return (Book[]) finalArray;
	}

	@Override
	public List<Book> getBooksContainingName(String str) {
		ArrayList<Book> theseBooks = new ArrayList<Book>();

		Iterator<Book> it = myBooks.iterator();
		while (it.hasNext()) {
			if (it.next().getbName().contains(str)) {
				theseBooks.add(it.next());
			}
		}
		return theseBooks;	
	}

	@Override
	public void applyDiscount(double discount) {
		System.out.println("Work Under Progress xD");
	}

}
