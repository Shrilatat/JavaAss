package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrderDao extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
			Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Order");
			Statement stmt = conn.createStatement();
			System.out.println(conn);
			String orderName=req.getParameter("book");
			//out.println(orderName);
			String sql="select bookname from book where category='"+orderName+"'";
		
			RequestDispatcher rd = req.getRequestDispatcher("Order.jsp");
			
			ResultSet rs = stmt.executeQuery(sql); 
			ServletContext sc = getServletContext();
			while(rs.next()) {
			sc.setAttribute("orderName",rs.getString(1));
			rd.include(req, resp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
}