package com.hsbc.Temp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TempCel")
public class TempConvServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		String str = req.getParameter("Temp");
		float x = (Float.parseFloat(str));
		
		float far = (9*x/5 + 32);
		
		String s = req.getParameter("Temp");
		
		out.println("<h1>Temperature in farenheit " + far + "</h1>");
	}
}
