
public class TestBookOps {
	public static void main(String[] args) {
		BookOperation ops= new BookOperation();
		ops.addBook(new Book(1,"Book1","Author1",100));
		ops.addBook(new Book(2,"Book2","Author2",200));
		ops.addBook(new Book(3,"Book3","Author1",50));
		ops.addBook(new Book(4,"Book4","Author2",75));
		ops.addBook(new Book(5,"Book5","Author3",150));
		ops.addBook(new Book(6,"Book6","Author4",125));
		ops.addBook(new Book(7,"Book8","Author3",75));
		ops.deleteBook(6);
		System.out.println(ops.getBookWithId(5));
		Book[] booksWithAuthor = ops.getBookWithAuthor("Author3");
		System.out.println("Books with Author");
		for(Book b : booksWithAuthor)
			System.out.println(b);
		System.out.println("All Books");
		ops.showAllBooks();
	}

}
