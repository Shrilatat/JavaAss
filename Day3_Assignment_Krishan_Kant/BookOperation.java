package demo;

import java.util.*;

public class BookOperation {

	private Set<Book> Books=new HashSet();
	public void addbook(Book b) {
		Books.add(b);
	}
	
	public void delbook(int id)
	{
		Iterator<Book> it=this.Books.iterator();
	
		while(it.hasNext())
		{
			Book b=it.next();
			if(b.getbookId()==id)
			{
				it.remove();
			}
		}
	}
	
	public void showbooks()
	{
		for(Book b:Books)
		{
			System.out.println(b);

		}
	}

	public Book getbook(int id)
	{
		Book bk=new Book();
		for(Book b : Books)
		{
			if(b.getbookId()==id)
			{
				bk=b;
			}
		}
		return bk;
	}

	public Book[] getbooksfromauthor(String author)
	{
		Book[] bk=new Book[Books.size()];
		
		int i=0;
		for(Book b: Books)
		{
			if(b.getauthorname()==author)
			{
				bk[i]=b;
				i=i+1;
			}
		}
		int length=i;
		Book[] ans=new Book[length];
		for(i=0;i<length;i++)
		{
			ans[i]=bk[i];
		}
		
		
		return ans;
	}
	



}
