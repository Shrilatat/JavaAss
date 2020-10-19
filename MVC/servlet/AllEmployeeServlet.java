package com.hsbc.trg;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hsbc.trg.AllEmployeeDao;

public class AllEmployeeServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		AllEmployeeDao empdao=new AllEmployeeDao();
		
		String[][] emplist=empdao.ShowAllEmployee();
		
		req.setAttribute("allemplist", emplist);
		
		req.getRequestDispatcher("ShowAllEmployee.jsp").forward(req, resp);
		
		
		//call function of dao class.
		
		//out.println("insideAllEmployeeServlet");
	}
	
	

}
