package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html"); // send HTML response back (Compulsory two lines)
		PrintWriter out = resp.getWriter(); //send data back to browser
		
		String s1=req.getParameter("name");
		String s2=req.getParameter("pass");
		
		LoginDAO l=new LoginDAO();
		try {
			if(l.verify(s1,s2)==true)
			{
				out.print("<html>");
				out.print("<body>Welcome "+s1+"</body>");
				out.print("</html>");
			}
			else
			{
				out.print("<html>");
				out.print("<body>Login failed!</body>");
				out.print("</html>");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
}}
