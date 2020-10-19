package com.hsbc.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SimpleInterestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * The below 2 statementss are compulsory while writing a servlet.
		 */
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
			
		String pass = (String) req.getAttribute("password");
		/*
		 * int principle = Integer.parseInt(req.getParameter("principle")); int rate =
		 * Integer.parseInt(req.getParameter("rate")); int years =
		 * Integer.parseInt(req.getParameter("years"));
		 * 
		 * int simpleInterest = (principle*rate*years)/100;
		 */
		
		out.println("<html>");
		out.println("<body><h1>"+pass+"</h1></body>");
		out.println("</html>");
		
		
	}
	
}
