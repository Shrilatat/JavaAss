package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleIntServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		int p = Integer.parseInt(req.getParameter("principal"));
		int r = Integer.parseInt(req.getParameter("rate"));
		int t = Integer.parseInt(req.getParameter("years"));
		int si = (p*r*t)/100;
		
		out.print("<html>");
		out.print("<body>Simple Interest is : "+si+"</body>");
		
		out.print("</html>");
	}
	
	
	
	

}
