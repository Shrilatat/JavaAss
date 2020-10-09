package com.trg.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeAuthenticationServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
	    PrintWriter out=resp.getWriter();
	    String username=req.getParameter("username");
	    String password=req.getParameter("password");
	    EmployeeAuthenticationDao obj=new EmployeeAuthenticationDao();
	    try {
			boolean check=obj.Validation(username, password);
			if(check==true) {
				 req.setAttribute("username", username);
				 RequestDispatcher rd=req.getRequestDispatcher("valid.jsp"); 
				    rd.forward(req, resp);
			}
			else {
				 RequestDispatcher rd=req.getRequestDispatcher("Invalid.jsp"); 
				    rd.forward(req, resp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   
	 
	    out.print("<h1>End of servlet</h1>");
	
}}