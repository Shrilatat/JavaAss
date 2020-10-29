
import java.util.*;

public class BookOperations {
	private Set<Books> bookobj = new HashSet<>();
	
	public void addBook(Books book) {
		bookobj.add(book);
	}
	
	public void deleteBook(int bookid) {
		Books ans = new Books();
		for(Books bk:bookobj) {
			if(bk.getBookId()==bookid) {
				ans = bk;
				break;
			}
		}
		bookobj.remove(ans);
	}
	public void showAllBooks() {
		for(Books bk:bookobj)
			System.out.println(bk);
		
	}
	public Books getBookWithId(int bookid) {
		Books ans=new Books();
		for(Books bk:bookobj) {
			if(bk.getBookId()==bookid) {
				ans = bk;
				break;
			}
		}
		return ans;
	}
	public Books[] getBookWithAuthor(String author) {;
		List<Books> ans = new ArrayList<>();
		for(Books bk:bookobj) {
			if(bk.getAuthor()==author) {
				 ans.add(bk);
			}
		}
		int l = ans.size();
		Books bookname[]=new Books[l];
		return ans.toArray(bookname);
		
	}
	

}
