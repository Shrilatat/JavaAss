package demo;

public class TestBookOps {

	public static void main(String[] args)
	{
		BookOperation bk= new BookOperation();
		bk.addbook(new Book(1,"bk1","Author10",110));
		bk.addbook(new Book(2,"bk2","Author12",111));
		bk.addbook(new Book(3,"bk3","Author13",112));
		bk.addbook(new Book(4,"bk4","Author14",113));
		bk.addbook(new Book(5,"bk5","Author15",114));
		bk.addbook(new Book(6,"bk6","Author12",114));
		bk.addbook(new Book(7,"bk7","Author12",114));
		
		
		bk.delbook(4);
		
		System.out.println(bk.getbook(1));
		Book[] authorbooks=bk.getbooksfromauthor("Author12");
		System.out.println("Books written by Author12 are as follows:");
		for(Book b :authorbooks)
		{
			System.out.println(b);
		}
		
		System.out.println("Showing all books :");
		bk.showbooks();
		
	}
	
}
