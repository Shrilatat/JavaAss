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

import com.hsbc.DBConnection;

public class AddNewEmp extends HttpServlet{
	
	Connection conn=null;
	
	public AddNewEmp()
	{
		conn = DBConnection.getConnection();
	}

	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String eid = req.getParameter("eid");
		String ename = req.getParameter("ename");
		int esal = Integer.parseInt(req.getParameter("esal"));
		String edept = req.getParameter("edept");
		
		EmployeeDetails empdtls = new EmployeeDetails();
		empdtls.setId(eid);
		empdtls.setName(ename);
		empdtls.setSalary(esal);
		empdtls.setDepartment(edept);
		
		try
		{
			String sql = " insert into emp values ("+empdtls.getId() + "," +empdtls.getName() + "," + empdtls.getSalary() + "," +empdtls.getDepartment() +")"; 
			Statement stmt = conn.createStatement();
			ResultSet rs = null ;
			rs=stmt.executeQuery(sql);
			if(rs!= null)
			{
				out.print("<html>");
				out.print("<body>");
				
				out.print("<h3>Successful</h3><br><br>");
				out.print("<form method='post' action='Login.jsp'>");
				out.print("<input type='button' value='Go back'>");
				out.print("</form>");
				
				out.print("</body>");
				out.print("</html>");
			}
			
		}
	
		 catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	
	

}
