package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddNumbersServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html"); //compulsory statements 
		PrintWriter out= resp.getWriter();
		
		int n1=Integer.parseInt(req.getParameter("no1"));
		int n2=Integer.parseInt(req.getParameter("no2"));
		int n3=n1+n2;
	
		out.print("<html>");
		out.print("<body><h1>Sum is"+n3+"<h1></body>");
		out.print("</html>");
	}

	

	
}
