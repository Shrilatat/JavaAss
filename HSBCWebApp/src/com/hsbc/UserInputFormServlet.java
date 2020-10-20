package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserInputFormServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		//String str = req.getParameter("uname");
		
		out.print("<html>");
		out.print("<body><h1>User Inputs</h1>");
		out.print("<table border=1>");
		
		Enumeration e = req.getParameterNames();
		while(e.hasMoreElements()) {
			
			String para = (String) e.nextElement();
			if(para.equals("password"))continue;
			out.print("<tr><td>"+ para+"</td><td>"+ req.getParameter(para) +"</td></tr>");
		}
		out.print("</table>");
		out.print("</body></html>");
		
	}
	
}
