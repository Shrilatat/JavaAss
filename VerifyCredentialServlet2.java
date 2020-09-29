package com.trg;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class VerifyCredentialServlet2 extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
	    PrintWriter out=resp.getWriter();
	    out.println("<html>");
	    out.println("<body><h4>The password for entered username is</h4></body>");
	    out.println("</html>");
	    RequestDispatcher rd=req.getRequestDispatcher("Order.jsp");
	    rd.forward(req, resp);
}
}