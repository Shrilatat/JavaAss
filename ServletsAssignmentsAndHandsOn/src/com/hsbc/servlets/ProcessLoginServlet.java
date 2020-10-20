package com.hsbc.servlets;

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

public class ProcessLoginServlet extends  HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
			Connection conn =DriverManager.getConnection("jdbc:derby://localhost:1527//TestDB1");
			Statement stmt = conn.createStatement();
			String username = req.getParameter("uname");
			String password = req.getParameter("pass");
			System.out.println(username+password);
			String credQuery ="select * from loginDB where username="+username;
			ResultSet rs= stmt.executeQuery(credQuery);
			while(rs.next()) {
				if(password==rs.getString(2)) {
					out.print("<html>");
					out.print("<body>");
					out.print("<h3> Login Succesful! </h3>");
					out.print("</body>");
					out.print("</html>");
				}
				else {
					out.print("<html>");
					out.print("<body>");
					out.print("<h3> Login Failed! </h3>");
					out.print("</body>");
					out.print("</html>");
				}
			}
			

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
