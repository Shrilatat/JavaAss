import java.util.*;
public class BookOperation {

	private HashSet<Book> bset = new HashSet<>();
	
	public BookOperation() {
	}

	public BookOperation(HashSet<Book> bset) {
		this.bset = bset;
	}
	
	public void addBook(Book book)
	{
		bset.add(book);
	}
	
	public void deleteBook(int bookid)
	{
		for( Book b : bset)
		{
			if(b.getBookid()==bookid)
			{
				bset.remove(b);
				break;
			}
		}
	}
	
	public void showAllBooks()
	{
		for(Book b : bset)
			System.out.println(b);
	}
	
	public Book getBookWithId(int bookid)
	{
		Book temp = new Book();
		for(Book b : bset)
		{
			if(b.getBookid()==bookid)
			{
				temp = b;
				break;
			}
		}
		return temp;	
	}
	
	public Book[] getBookWithAuthor(String author)
	{
		int count = 0;
		for( Book b : bset)
		{
			if(b.getAuthor() == author)
				count++;
		}
		Book arr[] = new Book[count];
		int i=0;
		for( Book b : bset)
		{
			if(b.getAuthor() == author)
			{
				arr[i]=b;
				i++;
			}
		}
		return arr;
	}
}
