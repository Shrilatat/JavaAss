
import java.util.*;

public class TestBookOps {
	public static void main(String[] args) {
		Books b1 = new Books(1,"dexter","Licht",200.00);
		Books b2 = new Books(2,"Oliver twist","dickens",100.00);
		Books b3 = new Books(3,"mockingjay","dickens",150.00);
		
		
		BookOperations val=new BookOperations();
		val.addBook(b1);
		val.addBook(b2);
		val.addBook(b3);
		
		val.showAllBooks();
		Books lists[]=val.getBookWithAuthor("dickens");
		for(Books b:lists)
			System.out.println(b);
		Books bid = val.getBookWithId(1);
		System.out.println(bid);
		
		val.deleteBook(3);
		
		val.showAllBooks();
		
	}

}
