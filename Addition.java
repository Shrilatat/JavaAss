package com.hsbc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//following 2 lines will be there in doGet every time
		resp.setContentType("text/ html"); 
		PrintWriter out = resp.getWriter();
		int no3;
		int no1 = Integer.parseInt(req.getParameter("n1"));
		int no2 = Integer.parseInt(req.getParameter("n2"));
		no3 = no1+no2;
		
		out.print("<html>");
		out.print("<body> <h1> Answer : "+ no3 +"</h1> </body> ");
		out.print("</html>");
		
	}
	
}
