package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleInterestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		float principle = Float.parseFloat(req.getParameter("p"));
		float rate = Float.parseFloat(req.getParameter("r"));
		float time= Float.parseFloat(req.getParameter("t"));;
		
		float si = principle*rate*time/100;
		out.print(si);
		
		
	}
	
}
