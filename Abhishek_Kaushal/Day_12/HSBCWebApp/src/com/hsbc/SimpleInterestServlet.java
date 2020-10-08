package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleInterestServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		int principalAmount = Integer.parseInt(req.getParameter("number1"));
		int numberOfYears = Integer.parseInt(req.getParameter("number2"));
		int rateOfInterest = Integer.parseInt(req.getParameter("number3"));
		double simpleInterest = 0.01 * rateOfInterest * principalAmount * numberOfYears;
		out.print("<html>");
		out.print("<body><h1>Simple Interest is " + simpleInterest + "</h1></body>");
		out.print("</html>");
	}
	
}
