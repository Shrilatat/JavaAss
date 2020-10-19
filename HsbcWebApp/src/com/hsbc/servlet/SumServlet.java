package com.hsbc.servlet;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.net.ssl.HttpsURLConnection;

public class SumServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int num3 = num1 + num2 ;
		
		out.print("<html>");
		out.print("<body><h1>The answer is => "+num3+"</h1></body>");
		out.print("</html>");
	}
}
