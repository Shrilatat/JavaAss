package com.hsbc.servlet;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.net.ssl.HttpsURLConnection;

public class SIservlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		int p = Integer.parseInt(req.getParameter("p"));
		int r = Integer.parseInt(req.getParameter("r"));
		int t = Integer.parseInt(req.getParameter("t"));
		int si = ((p*r*t)/100) ;
		
		out.print("<html>");
		out.print("<body><h1>Simple intrest => "+si+" </h1></body>");
		out.print("</html>");
	}
}
