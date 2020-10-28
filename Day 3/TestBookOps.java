
public class TestBookOps {
	public static void main(String[] args) {
		Book b1 = new Book(1,"Animal Farmhouse","G. Owell", 100);
		Book b2 = new Book(2,"The Alchemist","P. Coelho", 200);
		Book b3 = new Book(3,"Eleven Min","P. Coelho", 150);
		Book b4 = new Book(4,"The Witcher","A. sap", 400);
		
		BookOperation test =new BookOperation();
		
		test.addBook(b1);
		test.addBook(b2);
		test.addBook(b3);
		test.addBook(b4);
		
		test.showAllBooks();
		
		test.deleteBook(1);
		
		test.showAllBooks();
		
		System.out.println(test.getBookWithId(4));
		
		for(Book b : test.getBookWithAuthor("P. Coelho"))
			System.out.println(b);
		
		
		
	}
}
