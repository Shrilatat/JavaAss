package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginpage1")
public class LoginValidationServlet extends HttpServlet {

	
	protected void doget(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		String u  = req.getParameter("user1");
		String p  = req.getParameter("password");
		
		if(u.equals("Neel") && p.equals("Neel123"))
			out.println("<h1> " + "Login Success" +  "      </h1>");
		else
			out.println("<h1> " + "  Failure  " + "  </h1>");
		
	
	//out.println("<h1> " + "Calculated  Simple interest  is  " +  n/100 + "  </h1>");
		
		
			
	}
	
	
	
}
