package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class BookDao implements BookOperationInt {
	TreeSet<Book> set=new TreeSet<Book>(new MyNameComp());
	public void addBook(Book book) {
		set.add(book);
	}
public void deleteBook(int bookId) {
	Iterator<Book> itr=set.iterator();
	while(itr.hasNext()){
		Book b=itr.next();
		if( b.getBookId()==bookId) {
			itr.remove();
		}
	}
}
public void showAllBooks() {
	Iterator<Book> itr=set.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());	
	}
}
public Book getBookWithId(int bookId) {

    Book found = null;
	Iterator<Book> itr=set.iterator();
	while(itr.hasNext()){
		Book b=itr.next();
		if(b.getBookId()==bookId) {
			found=b;
			break;
			}}
	return found;
		
}
public Book[] getBookWithAuthor(String author) {
	List<Book> list=new ArrayList<>();
	int i=0;
	Iterator<Book> itr=set.iterator();
	while(itr.hasNext()){
		Book b=itr.next();
		if(b.getAuthor().equals(author)) {
			list.add(b);
		}}
	Book[] arr=new Book[list.size()];
	list.toArray(arr);
	return arr;
	
}
public List<Book> getBooksContainingName(String str){
	List<Book> l1=new ArrayList<Book>();
	Iterator<Book> itr=set.iterator();
	while(itr.hasNext()){
		Book b=itr.next();
		if(b.getBname().contains(str)) {
			l1.add(b);
		}
	} return l1;
}
public void applyDiscount(double discount) {
	double temp;
	Iterator<Book> itr=set.iterator();
	while(itr.hasNext()){
		Book b=itr.next();
		temp=b.getPrice()-discount;
		b.setPrice(temp);
	}		
}

}


