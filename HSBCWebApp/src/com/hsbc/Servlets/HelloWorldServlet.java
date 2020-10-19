package com.hsbc.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloWorldServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * The below 2 statementss are compulsory while writing a servlet.
		 */
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body><h1>Hello World</h1></body>");
		out.println("</html>");
		
		req.setAttribute("password", "secret");
		
		RequestDispatcher rd = req.getRequestDispatcher("SimpleInterest");
		rd.include(req, resp);
		
		out.println("<body><h1>Returned</h1></body>");
	}
	
}
