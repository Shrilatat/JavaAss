package com.hsbc.servletdemo.empEx;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String eid=req.getParameter("eid");
		String ename=req.getParameter("ename");
		String sal=req.getParameter("sal");
		String dept=req.getParameter("dept");
		
		EmpDao dao=new EmpDao();
		
		try {
			if(dao.addEmp(eid, ename, sal, dept)==true) {
				RequestDispatcher rd=req.getRequestDispatcher("welcomeEmp.jsp");
				rd.forward(req, resp);
			}
			else {
				out.print("<html>");
				out.print("<body><h1>Failed Login</h1></body>");
				out.print("<html>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
}
}
