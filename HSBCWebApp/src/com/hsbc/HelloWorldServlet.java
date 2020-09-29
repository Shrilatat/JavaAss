package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloWorldServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		//out.print("<html>");
		out.print("<body><h1>Hello World... </h1></body>");
		//out.print("</html>");
//		HttpSession sess = req.getSession();
//		sess.setAttribute("uname", "bharat");
//		String uname = (String)sess.getAttribute("uname");
//		out.print(uname);
		RequestDispatcher rd = req.getRequestDispatcher("processName");
		rd.include(req, resp);
		
		out.print("<body><h1>Hello World...the end </h1></body>");

	}
	
}
