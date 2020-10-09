package spring;

import java.util.ArrayList;
import java.util.List;

public class Bookmanager {
	List<BooksD> list;

	public List<BooksD> getBooklist() {
		return list;
	}

	public void setBooklist(List<BooksD> list) {
		this.list = list;
	}

	public List<BooksD> getAllBooksByAuthor(String AuthName) {
		List<BooksD> book = new ArrayList<>();
		for (BooksD bk : list) {
			if (bk.getBookAuthor().equals(AuthName))
				book.add(bk);

		}
		return book;
	}

	public BooksD getBookWithID(int id) {
		for (BooksD bk : list) {
			if (bk.getBookID() == id)
				return bk;

		}
		return null;

	}
}
