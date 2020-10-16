package com.hsbc.jspServlet;

import java.io.*;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.net.ssl.HttpsURLConnection;

public class DisplayServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
//		HttpSession session= req.getSession();
//		String name = (String)session.getAttribute("username");
//		
//		out.print("<html>");
//		out.print("<body bgcolor=\"lightgrey\"><h1> Hey! </h1></body>");
//		out.print("</html>");
		
		String pass = (String) req.getAttribute("password");
		out.print("<body bgcolor=\"lightgrey\"><h1> Hey! "+pass+"</h1></body>");
	}
}
