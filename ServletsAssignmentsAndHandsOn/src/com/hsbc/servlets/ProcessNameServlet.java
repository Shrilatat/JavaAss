package com.hsbc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessNameServlet extends  HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String str = req.getParameter("uname");
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Hello World ! from servlets "+ str+ " </h1>");
		out.print("</body>");
		out.print("</html>");
	}
	
	
}
