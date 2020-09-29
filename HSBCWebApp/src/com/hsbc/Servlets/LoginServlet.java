package com.hsbc.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * The below 2 statementss are compulsory while writing a servlet.
		 */
		try {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
			Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Login");
			
			Statement stmt = conn.createStatement();
			

			
			String username = req.getParameter("uname");
			String password = req.getParameter("pass");
			
			String verification = "select * from credentials";
			ResultSet rs = stmt.executeQuery(verification);
			int flag=0;
			while(rs.next()) {
				if(rs.getString(1).equals(username) && rs.getString(2).equals(password)) {
					flag=1;
					break;
				}
			}
			
			if(flag==1) {
				out.print("Credentials Correct");
			}
			else
				out.print("Login Failed.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	/*	resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
				
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int c = a + b;
		
		out.println("<html>");
		out.println("<body><h1>Ther result is "+c+"</h1></body>");
		out.println("</html>");*/
	}
	
}
