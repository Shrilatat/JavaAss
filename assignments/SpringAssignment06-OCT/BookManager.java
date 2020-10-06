package com.trg;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

	List<Books> blist;

	public List<Books> getBlist() {
		return blist;
	}

	public void setBlist(List<Books> blist) {
		this.blist = blist;
	}

	public List<Books> getAllBooksByAuthor(String aName) {
		List<Books> bnew = new ArrayList<>();
		for (Books b : blist) {
			if (b.getbAuthor().equals(aName))
				bnew.add(b);

		}
		return bnew;
	}

	public Books getBookWithID(int id) {
		for (Books b : blist) {
			if (b.getbID() == id)
				return b;

		}
		return null;

	}
}
