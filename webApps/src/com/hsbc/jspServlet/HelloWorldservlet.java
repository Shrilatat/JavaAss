package com.hsbc.jspServlet;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.net.ssl.HttpsURLConnection;

public class HelloWorldservlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		//session management
//		HttpSession session= req.getSession();
//		session.setAttribute("username","Ujjwal");
				
//		out.print("<html>");
//		out.print("<body bgcolor=\"lightblue\"><h1> Hello! </h1></body>");
//		out.print("</html>");
		
		//share control like goto
//		RequestDispatcher rd = req.getRequestDispatcher("displayServlet");
//		rd.forward(req,resp);
//		
//		resp.sendRedirect("/displayServlet");
//		out.print(<a href=\"/displayServlet\">Go to display servelet<a>);
//	
		
		//share control like a fucntion call
		out.print("<body bgcolor=\"lightgrey\"><h1> Start of Servelt </h1></body>");
		
		req.setAttribute("password","secret");
		
		RequestDispatcher rd = req.getRequestDispatcher("displayServlet");
		rd.include(req,resp);
		
		out.print("<body bgcolor=\"lightblue\"><h1> End of Servlet </h1></body>");
		
		
		//share information with request scope variables
//		ServletContext sc = getServletContext();
//		sc.setAttribute("userame","Ujjwal");
//	
	
	}
}
