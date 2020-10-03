package com.hsbc;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SimpleIntServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html"); //compulsory statements 
		PrintWriter out= resp.getWriter();
		
		
		int no1=Integer.parseInt(req.getParameter("f1"));
		int no2=Integer.parseInt(req.getParameter("f2"));
		int no3=Integer.parseInt(req.getParameter("f3"));
		int no4=(no1*no2*no3)/100;
		
		
		out.print("<html>");
		out.print("<body><h1>"+no4+"</h1></body>");
		out.print("</html>");
	}

	
}
