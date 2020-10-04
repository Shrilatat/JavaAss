package com.hsbc.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmploginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String action = req.getParameter("action");
		if (action == "DELETE") 
				remove(req, resp);	
		else
			System.out.println("nothing to delete");
	}

	public void remove(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EmpDao dao = new EmpDao();
		int id = (Integer.parseInt(req.getParameter("id")));
		if (dao.deleteEmployee(id)) {
			List<EmployeeBean> elist = dao.selectEmployees();
			req.getRequestDispatcher("Showemp.jsp").forward(req, resp);

		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String ename = req.getParameter("name");
		String epass = req.getParameter("pass");
		req.setAttribute("ename", ename);
		EmpLoginDao dao = new EmpLoginDao();
		EmpDao dao1 = new EmpDao();
		List<EmployeeBean> elist = dao1.selectEmployees();
		req.setAttribute("elist", elist);
		if (dao.validateUser(ename, epass)) {
			req.getRequestDispatcher("WelcomeEmployee.jsp").forward(req, resp);
		} else {
			System.out.println("error");
		}

	}

}
