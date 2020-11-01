package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SIForm")
public class SimpleIntServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		int p  = Integer.parseInt(req.getParameter("principal"));
		int r  = Integer.parseInt(req.getParameter("rate"));
		int t  = Integer.parseInt(req.getParameter("time"));
		
		int n = p * r * t;
		
	
	out.println("<h1> " + "Calculated  Simple interest  is  " +  n/100 + "  </h1>");
		
		
			
	}
	
	
	
}
