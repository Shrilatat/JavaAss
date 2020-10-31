package com.abc.servlet;

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

@WebServlet("/login")
public class LoginS extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String sql = "SELECT username,password FROM users WHERE username = '"+username+"'";
		Connection conn=null;
		Statement stmt=null;
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver()); //loading the driver.
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB2");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) { 
				if (rs.getString("password").equals(password))
					out.println("Welcome "+username);
				else 
					out.println("Invalid user or password.");
			} else {
				out.println("Invalid user or password.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
