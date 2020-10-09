package practice;

import java.util.List;

public class TestBookOp {
public static void main(String[] args) {
	BookOperationInt obj=new BookDao();
	obj.addBook(new Book(1,"abhinav","abhinav1",100.0));
	obj.addBook(new Book(2,"abhi","abhinav11",200.0));
	obj.addBook(new Book(3,"avi","abhinav111",300.0));
	
	obj.deleteBook(1);
	obj.showAllBooks();
    Book b=obj.getBookWithId(2);
    System.out.println(b);
    
    Book[] arr=obj.getBookWithAuthor("abhinav11");
    for(Book i:arr) {
    	System.out.println(i);
    }
    
    
   List<Book> list=obj.getBooksContainingName("abhi");
   System.out.println(list);
   
   obj.applyDiscount(20);
}
}
