package com.hsbc.assignments1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String bookid = req.getParameter("bookid");

		BookDao obj = new BookDao();

		List<Book> books = obj.display(bookid);

		out.print("<html><body bgcolor=\"lightgrey\">");
		out.println("<table border=1>");
//		out.println("<tr><th>Language</th><th>Title</th><th>BookID</th><tr>");
//		for (Book book : books) {
//			out.println("<tr><td>" + book.getLanguage() + "</td><td>" + book.getTitle()+ "</td><td>" + book.getBookid());
//		}

		req.setAttribute("data",books);

		RequestDispatcher rd = req.getRequestDispatcher("Book.jsp");

		rd.forward(req, resp);

		out.println("</table>");
		out.println("</html></body>");

	}
}