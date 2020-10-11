package com.hsbc;

import java.io.IOException;


import java.io.PrintWriter;
import java.sql.*;

import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ValidateUserServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html"); //compulsory statements 
		PrintWriter out= resp.getWriter();
		
		String username=req.getParameter("uname");
		String password=req.getParameter("pass");
		//System.out.println(username+password);
		
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
			Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527//Order");
			Statement stmt=con.createStatement();
			String sql="select *from Login";
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next())
			{
			if(username.equals(rs.getString(1))&&password.equals(rs.getString(2)))
					{
					RequestDispatcher rd=req.getRequestDispatcher("EmployeeInfo.jsp");
					rd.forward(req, resp);
					}
			}
	
			
				out.println("invalid");
			
			
		 }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	
}

