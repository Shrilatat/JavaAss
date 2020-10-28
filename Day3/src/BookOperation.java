import java.util.HashSet;
import java.util.Iterator;

public class BookOperation {
	
	private HashSet<Book> Bset = new HashSet<>();
	
	public void addBook(Book book) {
		
		Bset.add(book);
		System.out.println( book.getBname() +  " added");
		
	}
	
	public void deleteBook(int bookid) {
		
		Iterator<Book> it = Bset.iterator();
		
		while(it.hasNext()) {
			Book b = it.next();
			if(b.getBookID()==bookid) {
				System.out.println(b.getBname() + " deleted\n");
				it.remove();
				return;
			}
		}
				
			System.out.println("Book with this Id doesnt't exist\n");
		
	}
	
	void showAllBooks() {
		
		//System.out.println(Bset.toString());
		for(Book b : Bset) {
			System.out.println(b);
		}
		
	}
	
	public Book getBookWithId(int bookid) {
		
		for (Book b : Bset) {
			if(b.getBookID()==bookid) {
				return b;
			}
		}
		
		return null;
		}
	
	public Book[] getBookWithAuthor(String author) {
		
		Book[] blist = new Book[Bset.size()];
		int i=0;
		
		for (Book b : Bset){
			
			if( b.getAuthor() == author){
				blist[i]= b;
				i++;
			}
			
		}
		return blist;
		
	}

}
