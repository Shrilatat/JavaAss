package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  servelet class (BUSINESS CLASS that invokes DAO class methods)
 * @author ADITI GUPTA
 *
 */


public class UserValidationServlet extends HttpServlet{

	UserDao dao=new UserDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		if(dao.validateUser(uname,pass)) // for successful login
		{
			out.print("<html>");
			out.print("<body><h1> WELCOME " +uname +"</h1></body>");
			out.print("</html>");
			
		}
		else   //invalid credentials
		{
			out.print("<html>");
			out.print("<body><h1>INVALID CREDENTIALS!</h1></body>");
			out.print("</html>");
		}
		
		
	}

	
}
