package com.Pooja;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(value = "/simpleInterest")
public class SimpleIntServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		int principal = Integer.parseInt(req.getParameter("Principal"));
		int years = Integer.parseInt(req.getParameter("Years"));
		int rate = Integer.parseInt(req.getParameter("Rate in %"));
		
		int SI = (principal*years*rate)/100;
		out.println("<h1> Your Simple Interest is " + SI +"</h1>");
	}
	
	
	

}
