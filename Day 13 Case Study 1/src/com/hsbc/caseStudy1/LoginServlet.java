package com.hsbc.caseStudy1;

import java.io.*;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String name = req.getParameter("name");
		String pass = req.getParameter("pass");

		LoginDao dao = new LoginDao();

		try {
			if (dao.verifyData(name, pass) == true) {
				RequestDispatcher rd = req.getRequestDispatcher("welcomeEmp.jsp");
				rd.forward(req, resp);
			} else {
				out.print("<html>");
				out.print(
						"<body bgcolor=\"lightgrey\"><h1>Oops! Sorry. your attemp to login failed.</h1><br><h2>Either the username or the password was wrong.</h2></body>");
				out.print("<html>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}