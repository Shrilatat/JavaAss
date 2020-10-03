package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserInputFormServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html"); //compulsory statements 
		PrintWriter out= resp.getWriter();
		
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		String gender=req.getParameter("Gender");
		String[] Language=req.getParameterValues("Language");
		
//		out.print("<html>");
//		out.print("<body>");
//		out.print("<p>"+name+"</p>");
//		out.print("<p>"+pass+"</p>");
//		out.print("<p>"+gender+"</p>");
//		for (String string : Language) 
//			out.print("<p>"+string+"</p>");
//		out.print("<br>");	
//		out.print("</body>");
//		out.print("</html>");
		
		out.print("<html>");
	    out.print("<body><p1>Name : "+ name+ "</p1><br>");
	    out.print("<p2>Password : "+ pass+ "</p2><br>");
	    out.print("<p3>Gender : "+ gender+ "</p3><br>");
	    out.print("<p> languages</p>");
	    for (String string : Language) 
			out.print("<p>"+string+"</p>");
	   
	    //out.print("<p5>Language : "+ language+ "</p5><br></body>");
	    
	    out.print("</html>");
		

	}

	

	
}
