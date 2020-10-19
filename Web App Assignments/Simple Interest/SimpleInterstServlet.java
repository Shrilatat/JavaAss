package com.trg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleInterstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
	    
	    int P = Integer.parseInt(req.getParameter("P"));
	    int N = Integer.parseInt(req.getParameter("N"));
	    int R = Integer.parseInt(req.getParameter("R"));
	    int SI = (P*N*R)/100;
	    
	    
	    out.print("<html>");
	    out.print("<body><h1>Simple Interest is : "+ SI+ " Rs </h1></body>");
	    out.print("</html>");
	}

}
