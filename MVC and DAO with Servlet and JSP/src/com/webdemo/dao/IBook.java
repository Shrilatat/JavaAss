package com.webdemo.dao;
import java.util.ArrayList;

import com.webdemo.models.*;

public interface IBook {
	
	ArrayList<Book> getBooksBySubject(String subject);
	ArrayList<Book> getBooksByAuthor(String author);

}
