package com.hsbc.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleIntServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();

		int i1=Integer.parseInt(req.getParameter("num1"));
		int i2=Integer.parseInt(req.getParameter("num2"));
		int i3=Integer.parseInt(req.getParameter("num3"));

		double si=i1*(1+(i2*i3));
		out.print("<html>");
		out.print("<body><h1>Simple Interest is "+si+"</h1></body>");
		out.print("<html>");

	}



}