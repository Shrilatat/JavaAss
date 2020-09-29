package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.dao.BookDatabaseDao;
import com.hsbc.model.Book;

public class GetAllBooksServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		BookDatabaseDao dao = new BookDatabaseDao();
		List<Book> books = null;
		try {
			books = dao.getAllBooks();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		out.print("<html><body>");
		
		
		out.print("Books available");
		
		out.print("<table border=1>");
		out.print("<tr><td>Name</td><td>Author</td><td>Price</td><td>Order</td></tr>");
		
		if (books!=null)
			for(Book book: books) {
				out.print("<tr><td>"+book.getBookName()+"</td><td>"+book.getAuthor()+"</td><td>"+book.getPrice()+"</td><td><a href=#>Add to cart</a></td></tr>");
			}
		
		out.print("</table>");
		out.print("</body></html>");
		
	}
	
}
