package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.dao.LoginDatabaseDao;

public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String uname = req.getParameter("uname");
		String pass = req.getParameter("password");
		
		LoginDatabaseDao dao = new LoginDatabaseDao();
		
		try {
			if (dao.validate(uname, pass)) {
				out.print("<h1>Successfully logged in</h1>");
			}
			else {
				out.print("<h1>Wrong credentials</h1>");
			}
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		} 
		
	}
	
}
