package com.hsbc.servlet;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.net.ssl.HttpsURLConnection;

public class PNservlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String str = req.getParameter("uname");
		
		out.print("<html>");
		out.print("<body><h1>HelloWorld....welcome to servlets  " + str + "</h1></body>");
		out.print("</html>");
	}
}
