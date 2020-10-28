import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class BookOperation {
	Set<Book> set = new HashSet<>();

	public void addBook(Book book) {
		set.add(book);
	}
	
	public void deleteBook(int bookid) {
		Iterator<Book> it= set.iterator();
		while(it.hasNext()) {
			Book bk=it.next();
			if(bk.getBookno()==bookid)
				it.remove();
		}
	}
	
	public void showAllBooks() {
		Iterator<Book> it= set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public Book getBookWithId(int bookid) {
		Book bk = new Book();
		for (Book b : set) {
			if (b.getBookno() == bookid) {
				bk = b;
			}
		}
		return bk;
	}
	
	public Book[] getBookWithAuthor(String author) {
		Set<Book> b1= new HashSet<>();
		int i = 0,j=0;
		for (Book b : set) {
			if (author.equals(b.getAuthor())) {
				b1.add(b);
				i++;
			}
				
		}
		
		Book[] bk = new Book[i];
		for(Book b: b1) {
			bk[j]=b;
			j++;
		}
		return bk;
	}
	
}
