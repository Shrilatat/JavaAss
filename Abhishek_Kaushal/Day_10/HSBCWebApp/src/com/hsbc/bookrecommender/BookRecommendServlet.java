package com.hsbc.bookrecommender;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookRecommendServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String category = req.getParameter("category");
		//System.out.println(category);
		BookRecommenderDao dao = new BookRecommenderDao();
		String[] books = dao.getBooks(category);
		out.print("<html>");
		out.print("<body><table border = 1>");
		for(String book : books)
		{
			out.print("<tr><td>" + book + "</td><td>" + category + "</td></tr>");
		}
		out.print("</table></body>");
		out.print("</html>");
	}
	
	

}
