package com.trg.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trg.dao.EmpDao;

public class EmpServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		EmpDao dao = new EmpDao();

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int salary = Integer.parseInt(req.getParameter("salary"));
		String department = req.getParameter("department");
		
		dao.pushEmployee(id, name, salary, department);
		RequestDispatcher rd= req.getRequestDispatcher("employee.html");
		if(rd!=null) {
			rd.forward(req, resp);
		}
	}
}
