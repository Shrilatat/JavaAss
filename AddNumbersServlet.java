package com.trg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddNumbersServlet extends HttpServlet{

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
	    PrintWriter out=resp.getWriter();
	
	    int num1=Integer.parseInt(req.getParameter("no1"));
	    int num2=Integer.parseInt(req.getParameter("no2"));
	    int num3=num1+num2;
	    
	    out.print("<html>");
	    out.print("<body><h1>The Result is"+num3+"</h1><body>");
	    out.print("</html>");
	}
}
