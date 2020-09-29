package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html"); // send HTML response back (Compulsory two lines)
		PrintWriter out = resp.getWriter(); //send data back to browser
		
		out.print("<html>");
		out.print("<body><h1>Hello World! Welcome to Servlets</h1></body>");
		out.print("</html>");
	}
	
	
}
