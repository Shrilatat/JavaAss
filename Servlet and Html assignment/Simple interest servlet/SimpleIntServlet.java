package com.hsbc.Interest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/si")
public class SimpleIntServlet extends HttpServlet {
	
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String princAmt = req.getParameter("amt");
		String tm = req.getParameter("time");
		String inters = req.getParameter("interest") ;
		float p = (Float.parseFloat(princAmt));
		float T = (Float.parseFloat(tm));
		float R = (Float.parseFloat(inters));

		
		float far = p*R*T/100 ;
		
		
		out.println("<h1>Simple interest : " + far + "</h1>");
	}

}
