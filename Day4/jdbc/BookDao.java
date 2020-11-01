package Day4;


import java.util.LinkedList;
import java.util.List;

public class BookDao {
	
	List<Book> booklist = new LinkedList<>();
	
	void add_book(Book b){
		booklist.add(b);
	}
	
	void delete_book(int bid){
		for (Book a : booklist) {
			if((a.getBookid() == bid) && (bid != 1))
				booklist.remove(a);
		}
		if (bid == 1)
			booklist.remove(0);
		//System.out.println("After Deleting");		
	}
	
	void update_book(int bid, double price){
		for (Book a : booklist) {
			if(a.getBookid() == bid)
				a.setPrice(price);
		}
	}
	
	List<Book> get_all_books(){
		return booklist;
	}
	Book bookbyid(int bid){
		for (Book a : booklist) {
			if(a.getBookid() == bid)
				return a;
		}
		return null;
	}
}
