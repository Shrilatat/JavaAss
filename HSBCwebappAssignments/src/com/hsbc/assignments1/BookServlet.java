package com.hsbc.assignments1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String lang = req.getParameter("lang");
		
		BookDao obj = new BookDao();
		
		List<Book> books = obj.display(lang);

		out.print("<html><body bgcolor=\"lightgrey\">");
		out.println("<table border=1>");
		out.println("<tr><th>Language</th><th>Title</th><tr>");
		for (Book book : books) {
			out.println("<tr><td>" + book.getLanguage() + "</td><td>" + book.getTitle());
		}
		out.println("</table>"); 
		out.println("</html></body>"); 
		
	}
}