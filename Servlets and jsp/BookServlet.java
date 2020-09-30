package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		
		String cat = req.getParameter("ne");
		BookDao bd = new BookDao();
		List<Book> list = bd.getBooks(cat);
		
		
		
		out.print("<html>");
		out.print("<body>");
		
		out.print("<table border=1>");
		out.print("<tr>" + "<td>Name</td>" + "<td>Author</td>" + "<td>Price</td>"+"</tr>");
		
		for(Book b:list)
		{
			out.print("<tr><td>"+b.getName()+"</td><td>"+b.getAuthor()+"</td><td>"+b.getPrice()+"</td>");	
		}
		out.print("</table>");
		out.print("<body>");
		out.print("</html>");
	}

	

	
	
	
}
