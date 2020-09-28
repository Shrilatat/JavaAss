package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.db.DBConnection;

/**
 * 
 * @author suryavanshi
 *
 */

public class BookServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String lang = req.getParameter("lang");
		
		BookDao dao = new BookDao();
		List<Book> books = dao.display(lang);

		out.print("<html><body>");
		out.println("<table border=1 width=50% height=50%>");
		out.println("<tr><th>Lang</th><th>Title</th><th>Price</th><tr>");
		for (Book book : books) {
			out.println("<tr><td>" + book.getLang() + "</td><td>" + book.getTitle() + "</td><td>" + book.getPrice());
		}
		out.println("</table>"); 
		out.println("</html></body>"); 
//		ResultSet rs = dao.display(lang);
//
//		try {
//			out.print("<html><body>");
//			out.println("<table border=1 width=50% height=50%>");  
//			out.println("<tr><th>Lang</th><th>Title</th><th>Price</th><tr>");  
//			while(rs.next()) {
//				out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td></tr>");  
//			}
//			out.println("</table>");  
//            out.println("</html></body>"); 
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}
		
	}
}
