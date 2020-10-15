package com.hsbc.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddNumbersExServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		int i1=Integer.parseInt(req.getParameter("num1"));
		int i2=Integer.parseInt(req.getParameter("num2"));
	
		out.print("<html>");
		out.print("<body><h1>Sum of numbers is "+(i1+i2)+"</h1></body>");
		out.print("<html>");
		
	}
	
	

}
