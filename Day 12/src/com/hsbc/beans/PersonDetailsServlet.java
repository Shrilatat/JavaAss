package com.hsbc.beans;

import java.io.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;


public class PersonDetailsServlet extends HttpServlet {

	static Connection conn = null;

	void PersonDetailsServlet() {
		conn = DBConnection.getConnection();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		try {
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			String email = req.getParameter("email");
			String gender = req.getParameter("gender");
			String age = req.getParameter("age");
			String address = req.getParameter("address");
			String phone = req.getParameter("phone");

			PreparedStatement pst = conn.prepareStatement("insert into personaldetails values(?,?,?,?,?,?,?)");
			pst.setString(1, username);
			pst.setString(2, password);
			pst.setString(3, email);
			pst.setString(4, gender);
			pst.setString(5, age);
			pst.setString(6, address);
			pst.setString(7, phone);
			int i = pst.executeUpdate();
			if (i != 0) {
				out.println("<br>Hey! Data has been added. :)");
			} else {
				out.println("<br>Sorry! Failed to insert the data. :(");
			}
		} catch (Exception e) {
			out.println(e);
		}

	}

}
