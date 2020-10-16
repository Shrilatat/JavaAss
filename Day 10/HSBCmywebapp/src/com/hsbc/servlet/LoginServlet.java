package com.hsbc.servlet;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.net.ssl.HttpsURLConnection;

public class LoginServlet extends HttpServlet {

	UserDaoClass obj = new UserDaoClass();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");

			if (obj.validateUser(uname, pass)) {
				out.print("<html>");
				out.print("<body><h1> Hey ! Welcome " + uname + "</h1></body>");
				out.print("</html>");

			} else {
				out.print("<html>");
				out.print("<body><h1> Oops! Wrong credentials. </h1></body>");
				out.print("</html>");
			}

		}
	}
