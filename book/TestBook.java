package book;

public class TestBook {
	public static void main(String[] args){
		BookDao bdao = new BookDao();
		
		bdao.addBook(new Book(1,"First Book","First Author",100));
		bdao.addBook(new Book(2,"Second Book","Second Author",200));
		bdao.addBook(new Book(3,"Third Book","Third Author",300));
		bdao.addBook(new Book(4,"Fourth Book","Fourth Author",400));
		
		
		try {
			bdao.getBookWithId(1001);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			// System.out.println(e1);
			e1.printStackTrace();
		} // Will throw an exception
		
		try {
			bdao.deleteBook(97);
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		
		bdao.showAllBooks();
		
		try {
			bdao.deleteBook(3);
		} catch (Exception e) {
			
		}
		
		bdao.getBooksContainingName("Second");
		
		// bdao.applyDiscount(10);
		
		// Throw user defined exceptions from BookDao and catch them in TestBook
		
		
	}
}
