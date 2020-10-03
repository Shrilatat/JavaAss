package com.hsbc.jspServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstCookieServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("userName");
		out.println("Welcome " + name + " to first servlet<br>");

		Cookie ck = new Cookie("uname", name);
		response.addCookie(ck);

		out.println("Cookie created!<br>");
		out.print("<a href='servlet2'>Continue to next servlet</a>");
		out.close();
	}
}