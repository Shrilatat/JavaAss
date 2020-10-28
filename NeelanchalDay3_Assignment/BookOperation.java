import java.util.HashSet;
import java.util.Iterator;

public class BookOperation {

	// Book b = new Book();
	private HashSet<Book> h = new HashSet<Book>();

	public void addBook(Book book) {
		h.add(book);
	}

	public void showBook() {
		for (Book t : h)
			System.out.println(t);
	}

	public void deleteBook(int bookid) {

		Iterator<Book> i = h.iterator();

		while (i.hasNext()) {

			Book b = i.next();

			if (b.getBookId() == bookid)
				i.remove();
		}
	}

	public Book getBookWithId(int bookid) {
		Book testBook = new Book();
		for (Book b : h) {
			if (b.getBookId() == bookid)
				testBook = b;
		}
		return testBook;
	}

	public Book[] getBookWithAuthor(String autName) {
		int n = h.size();
		Book[] testBook = new Book[n];
		int x = 0;
		for (Book b : h) {
			if (b.getAuthor().equals(autName)) {
				testBook[x] = b;
				System.out.println(testBook[x]+ " i am inside target loop ");
				x++;
			}
				System.out.println(x);
		}
		return testBook;
	}
}
