package com.hsbc.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String userName = req.getParameter("username");
		String password = req.getParameter("password");
		LoginDao dao = new LoginDao();
		if(dao.validate(userName, password))
		{
			out.print("<html>");
			out.print("<body><h1>Login successful!</h1></body>");
			out.print("</html>");
		}
		else
		{
			out.print("<html>");
			out.print("<body><h1>Login failed</h1></body>");
			out.print("</html>");
		}
		
	}
	
}
