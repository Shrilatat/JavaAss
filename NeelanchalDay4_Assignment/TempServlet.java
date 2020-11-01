package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TempForm")
public class TempServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		String str = req.getParameter("user");
		
		int n =Integer.parseInt(str);
		
	int z = (n-32) *5/9;
	
	out.println("<h1> " +n +"  in farenheit is equal to  "+ z + "   in celsius   "+  "</h1>");
		
		
			
	}
	
	
	
}
