package com.hsbc;

import java.io.IOException;


import java.io.PrintWriter;
import java.sql.*;

import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.Dao.LoginDao;

public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html"); //compulsory statements 
		PrintWriter out= resp.getWriter();
		
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		LoginDao dao=new LoginDao();
		if(dao.validate(uname, pass))
		{
			out.print("<html>");
			out.print("<body><h1> Login Successful</h1><body");
			out.print("</html>");
			
		}
		else
		{
			out.print("<html>");
			out.print("<body><h1> Login UnSuccessful</h1><body");
			out.print("</html>");
		}
		

	}
}

