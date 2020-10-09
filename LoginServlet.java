package com.hsbc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.database.LoginDao;

public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//following 2 lines will be there in doGet every time
		resp.setContentType("text/ html"); 
		PrintWriter out = resp.getWriter();
		
		LoginDao login = new LoginDao();
		String username = req.getParameter("uname");
		String passwd = req.getParameter("pass");
		System.out.println(username);
		try {
			if(login.verifyData(username, passwd))
			{
				out.print("<html>");
				out.print("<body> <h1> Welcome "+ username +"</h1> </body> ");
				out.print("</html>");
			}
			else {
				out.print("<html>");
				out.print("<body> <h1> Login failed</h1> </body> ");
				out.print("</html>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
	
}
