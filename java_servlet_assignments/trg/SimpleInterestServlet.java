package com.hsbc.trg;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleInterestServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		int prin=Integer.parseInt(req.getParameter("prn"));
		int rate=Integer.parseInt(req.getParameter("rate"));
		int year=Integer.parseInt(req.getParameter("year"));
		int si= (prin*rate*year)/100;
		out.print("<html>");
		out.print("<body><h1>SimpleInterest="+si+"</h1></body>");
		out.print("<html>");
		
	}
	
	

}
