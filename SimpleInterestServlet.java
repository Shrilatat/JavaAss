package com.hsbc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleInterestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//following 2 lines will be there in doGet every time
		resp.setContentType("text/ html"); 
		PrintWriter out = resp.getWriter();
	
		int P = Integer.parseInt(req.getParameter("amt"));
		int T= Integer.parseInt(req.getParameter("years"));
		int R = Integer.parseInt(req.getParameter("rate"));
		float famt = P + (P * R * T)/100;
		
		out.print("<html>");
		out.print("<body> <h1> Answer : "+famt +"</h1> </body> ");
		out.print("</html>");
		
	}
	
}
