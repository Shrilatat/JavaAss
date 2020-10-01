package com.trg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
	    
	    String name = req.getParameter("name");
	    String pass = req.getParameter("pass");
	    String gen =  req.getParameter("gender");
	    String age = req.getParameter("age");
	    String language = req.getParameter("languages");
	    
	    out.print("<html>");
	    out.print("<body><p1>Name : "+ name+ "</p1><br>");
	    out.print("<p2>Password : "+ pass+ "</p2><br>");
	    out.print("<p3>Gender : "+ gen+ "</p3><br>");
	    out.print("<p4>Age : "+ age+ "</p4><br>");
	    out.print("<p5>Language : "+ language+ "</p5><br></body>");
	    
	    out.print("</html>");
	}

}
