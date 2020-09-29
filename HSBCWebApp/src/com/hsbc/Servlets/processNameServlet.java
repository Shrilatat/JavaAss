package com.hsbc.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class processNameServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * The below 2 statementss are compulsory while writing a servlet.
		 */
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String str = req.getParameter("uname");
		
		out.println("<html>");
		out.println("<body><h1>Hello welcome to servlets"+str+"</h1></body>");
		out.println("</html>");
	}
	
}
