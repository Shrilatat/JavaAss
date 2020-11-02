import java.util.HashSet;

public class TestBookOps {
	
	public static void main(String[] args) {
		
		BookOperation books = new BookOperation();
		
		books.addBook(new Book(101, "BookA", "Author_A", 250));
		books.addBook(new Book(102, "BookB", "Author_B", 150));
		books.addBook(new Book(103, "BookC", "Author_C", 350));
		books.addBook(new Book(104, "BookD", "Author_D", 500));
		books.addBook(new Book(105, "BookE", "Author_E", 200));
		books.addBook(new Book(106, "BookJ", "Author_E", 400));
		
		System.out.println();
		
		books.deleteBook(103);
		
		int id_search = 109;
		Book b = books.getBookWithId(id_search);
		if(b!=null) {
			System.out.println(b + "\n");
		}
		else {
			System.out.println("There's no book with this BookId !\n");
		}
			
		Book[] bb = books.getBookWithAuthor("Author_E");
		
		for(Book c : bb) {
			if(c!=null)
				System.out.println(c);
		}
		
		System.out.println();
		
		books.showAllBooks();
		
		
		
		
		
		
		
	}
	
	

}
