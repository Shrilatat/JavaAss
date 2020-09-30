package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Book> b_list = new ArrayList<>();
		resp.setContentType("text/html"); // send HTML response back (Compulsory two lines)
		PrintWriter out = resp.getWriter(); // send data back to browser

		String s1 = req.getParameter("category");

		BookDao b = new BookDao();

		try {
			b_list = b.getAllBooks(s1);
			// System.out.println("Display");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
