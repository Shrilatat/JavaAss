package com.trg;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class VerifyCredentialServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
	    PrintWriter out=resp.getWriter();
	
	    String num1=req.getParameter("username");
	    String num2=req.getParameter("password");
	    
	    DBDemoDao obj=new DBDemoDao();
	  
		
		try {
			boolean value = obj.Validation(num1,num2);
			if(value==true) {
			    out.print("<html>");
			    out.print("<body><h1>Login Success "+num1+" </h1></body>");
			    out.print("</html>");
			}
			   else if(value==false){
				   out.print("<html>");
				    out.print("<body><h1>Login Failed "+num1+" </h1></body>");
				    out.print("</html>");
	
	}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			 
	    
	  
}
}