package com.hsbc;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessNameServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter(); //out is to send to browser
		
		String str=req.getParameter("uname");
		out.print("<html>");
		out.print("<body><h1> hello world....Welcome to servelets"+str+"</h1></body>");
		out.print("</html>");
}
}