package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloworldServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter(); //out is to send to browser
		
		HttpSession session=req.getSession();
		session.setAttribute("username", "Bhavya");
		//Date d= new Date();
		//resp.setHeader("refresh", "1");//to refresh after every second
		out.print("<html>");
		//out.print("<body><h1>"+d.toString()+"</h1></body>");
		out.print("<body>Welcome</body>");
		out.print("</html>");
		//super.doGet(req, resp); //this is not with date
	}

}
