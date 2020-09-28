package com.hsbc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditonServlet extends  HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		
		int sum = Integer.parseInt(num1)+Integer.parseInt(num2);
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h3>The sum of two numbers is "+sum+ " </h3>");
		out.print("</body>");
		out.print("</html>");
	}
	
	
}
