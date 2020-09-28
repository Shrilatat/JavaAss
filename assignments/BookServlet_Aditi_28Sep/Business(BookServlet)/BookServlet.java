package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet class that invokes the DAO class to access the details of the book of a given category
 * @author ADITI GUPTA
 *
 */
public class BookServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String str = req.getParameter("books");
		BookFindDao dao = new BookFindDao();
		ResultSet rs = dao.getBooks(str);
		out.print("<html>");
		out.print(
				"<body><h1>BOOK DETAILS</h1><table border=5><tr><td>BOOK ID</td><td>BOOK NAME</td><td>BOOK CATEGORY</td><td>PRICE</td></tr>");
		if (rs != null) {
			try {
				while (rs.next()) {
					out.println("<tr><td>" + rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>"
							+ rs.getString(3) + "</td><td>" + rs.getInt(4) + "</td></tr>");

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			out.println("</table></body></html>");
		} else {
			out.print("<h1>error</h1>");
		}

	}
}
