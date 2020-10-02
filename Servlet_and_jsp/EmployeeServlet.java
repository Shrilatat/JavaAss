package com.hsbc.dao;

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

import org.apache.derby.client.am.SqlException;

import com.hsbc.DBConnection;

public class EmployeeServlet extends HttpServlet {
	
	Connection conn=null;
	
	public EmployeeServlet()
	{
		conn = DBConnection.getConnection();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String ename = req.getParameter("name");
		String password = req.getParameter("pass");
		Employee emp=new Employee();
		emp.setName(ename);
		emp.setPass(password);
	try
		{
			String sql = "select * from emp where name '"+emp.getName()+"'"; 
			Statement stmt = conn.createStatement();
			ResultSet rs = null ;
			
			if(rs.getString(2).equals(password))
			{
				out.print("<html>");
				out.print("<body>");
				out.print("<h3>Employee info system</h3><br><br>");
				out.print("<h1>Welcome"+emp.getName()+"</h1><br><br>");
				out.print("<a href='Addemp.jsp'>Add new Employee</a>");
				out.print("<a href='retrieve.jsp'>Retrieve all employee records</a>");
				
				
				out.print("</body>");
				out.print("</html>");
			}
			
		}
	
		 catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	

}
