package Day3Ass;

public class TestBookOps {

	public static void main(String[] args) {
		BookOperation test = new BookOperation();
		test.addBook(new Book(1,"Book1","A1",121.0));
		test.addBook(new Book(2,"Book2","A2",5462.0));
		test.addBook(new Book(3,"Book3","A3",56.0));
		test.addBook(new Book(4,"Book4","A4",454.0));
		test.addBook(new Book(5,"Book5","A4",6545.0));
		
		test.showBook();
		System.out.println("------------------------");

		System.out.println(test.getBookWithId(2));
		System.out.println("------------------------");

		test.deleteBook(3);

		Book[] x = test.getBookWithAuthor("A4");

		for(Book b : x)
			System.out.println(b);
		System.out.println("------------------------");

		System.out.println(" All left records are :");

		test.showBook();
		System.out.println("------------------------");

	}
}
