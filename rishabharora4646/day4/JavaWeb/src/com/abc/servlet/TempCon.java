package com.abc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tempcon")
public class TempCon extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		double ftemp = Double.parseDouble(req.getParameter("fscale"));
		double ctemp = (ftemp - 32) * 5 /9;
		out.println("Temperature in Celsius: "+ctemp);
	}
	
}
