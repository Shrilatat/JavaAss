
public class TestBookOps {
	
	public static void main(String[] args) {
		BookOperation test = new BookOperation();
		test.addBook(new Book(101,"B1","A1",101.0));
		test.addBook(new Book(102,"B2","A2",102.0));
		test.addBook(new Book(103,"B3","A3",103.0));
		test.addBook(new Book(104,"B4","A4",104.0));
		test.addBook(new Book(105,"B5","A4",105.0));
		
		System.out.println(test.getBookWithId(102));
		
		test.deleteBook(103);
		
		Book[] x = test.getBookWithAuthor("A2");
		
		for(Book b : x)
			System.out.println(b);
		
		System.out.println(" All left records are :");
		
		//test.showBook();
		
	}
}
