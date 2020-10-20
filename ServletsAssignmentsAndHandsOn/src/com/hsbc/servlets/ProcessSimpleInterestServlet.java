package com.hsbc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessSimpleInterestServlet extends  HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String principal = req.getParameter("principal");
		String numberOfYears = req.getParameter("noy");
		String rate = req.getParameter("rate");
		
		float interest = (Float.parseFloat(principal)*Float.parseFloat(numberOfYears)*Float.parseFloat(rate))/100.0f;
		out.print("<html>");
		out.print("<body>");
		out.print("<h3>The Interest is "+interest+ " </h3>");
		out.print("</body>");
		out.print("</html>");
	}
	
	
}
