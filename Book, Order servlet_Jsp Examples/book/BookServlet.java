package com.hsbc.servletdemo.book;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookServlet extends HttpServlet{
	List<Book> blist=new ArrayList<>();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String str=req.getParameter("cat");
		System.out.println("In servlet");
		BookDao dao=new BookDao();
		try {
			blist=dao.getAllBooks(str);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		out.print("<html>");
		out.print("<body>");
		out.print("<table border=1 width=30% height=20%>"); 
		out.print("<tr>\r\n" + 
				"    <th>Book Name</th>\r\n" + 
				"    <th>Author</th>\r\n" + 
				"    <th>Price</th>\r\n" + 
				"  </tr>"); 
		for(Book b:blist) {
			 out.print("<tr><td>"+b.getBname()+"</td><td>"+b.getAuthor()+"</td><td>"+b.getPrice()+"</td><tr>");
		}
		out.print("<html>");
		
	}

}
