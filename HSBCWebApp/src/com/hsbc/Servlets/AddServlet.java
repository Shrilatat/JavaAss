package com.hsbc.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * The below 2 statementss are compulsory while writing a servlet.
		 */
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
				
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int c = a + b;
		
		out.println("<html>");
		out.println("<body><h1>Ther result is "+c+"</h1></body>");
		out.println("</html>");
	}
	
}
