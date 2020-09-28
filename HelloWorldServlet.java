package com.hsbc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//following 2 lines will be there in doGet every time
		resp.setContentType("text/ html"); 
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<body> <h1> Mauli is here</h1> </body> ");
		out.print("</html>");
		
	}
	
}
