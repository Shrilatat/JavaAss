package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DisplayServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
//		HttpSession session = req.getSession();
//		String str = (String)session.getAttribute("username");
		
		//resp.setHeader("refresh", "1");
		String str = (String)req.getAttribute("password");
		out.print("<html>");
		out.print("<body><h1>Welcome to display, password is "+str+"</h1></body>");
		out.print("</html>");
	}
	
}
