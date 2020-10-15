package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 
 * @author suryavanshi
 *
 */
public class InterestServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		int amt = Integer.parseInt(req.getParameter("amt"));
		int years = Integer.parseInt(req.getParameter("years"));
		int roi = Integer.parseInt(req.getParameter("roi"));
		
		int interest = amt*(1+(years*roi));
		
		out.print("<html>");
		out.print("<body><h1>Final Amount is " + interest + "</h1></body>");
		out.print("</html>");
	}

}
