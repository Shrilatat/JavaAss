package com.Pooja;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/loginPage")
public class loginServ extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String username = req.getParameter("Username");
		String password = req.getParameter("Password");
		
		Connection conn=null;
		Statement stmt=null;
		
		
		String sql = "SELECT uname,pwd FROM users WHERE uname =" + username;
			
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB2");
			
			stmt  = conn.createStatement();
			ResultSet rs= stmt.executeQuery(sql);
			
			if(rs.next()) {
				if(rs.getString("pwd").equals(password))
					out.println("Welcome");
				else
					out.println("Invalid Username or Password");
				
			}
		
		
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		
		finally {
			
			try {
				
				stmt.close();
				conn.close();
				
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
			
			
		}
			
	}
	

}
