package com.hsbc.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.dao.BookDao;
import com.hsbc.model.Book;

public class FindBookServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		BookDao book = new BookDao();
		Book temp = new Book();
		
		int id = Integer.parseInt( req.getParameter("id"));
		temp = book.getBookById(id);
		
		req.setAttribute("Book", temp);
		
		RequestDispatcher rd = req.getRequestDispatcher("bookDetails.jsp");
		rd.include(req,resp);
		
//		out.print("<html>");
//		out.print("<body>");
//		out.print("<h1>The book you requested is: </h1>");
//		out.print("<table>");
//		out.print("<tr><td>"+temp.getBookId()+"</td><td>"+temp.getBookName()+"</td>"+"<td>"+temp.getAuthor()+"</td><td>"+temp.getPrice()+"</td></tr>");
//		out.print("</table>");
//		out.print("</body>");
//		out.print("</html>");
		
	}
	

}
