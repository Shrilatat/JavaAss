package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloWorldServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
//		HttpSession session = req.getSession();
//		System.out.println(session.getId());
//		session.setAttribute("username", "abhishek");
		
		//resp.setHeader("refresh", "1");
		//out.print("<html>");
		out.print("<h1>Welcome to servlet</h1>");
		//out.print("</html>");
		
		req.setAttribute("password", "secret");
		RequestDispatcher rd = req.getRequestDispatcher("display");
		//rd.forward(req, resp);
		rd.include(req, resp);
		
		out.print("<h1>End of welcome servlet</h1>");
	}
	
}
