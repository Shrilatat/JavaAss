package practice;

import java.util.Comparator;

public class MyNameComp implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
	if(o1.getBookId()>o2.getBookId()) {
		return 1;
	}
	else {
		return -1;
	}
	}

}
