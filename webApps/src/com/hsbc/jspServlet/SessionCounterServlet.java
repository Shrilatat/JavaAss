package com.hsbc.jspServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionCounterServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		
		Integer counter = (Integer) session.getAttribute("counter");
		if (counter == null) {
			counter = 1;
			session.setAttribute("counter", counter);
		} else {
			session.setAttribute("counter", counter + 1);
		}
		StringBuffer buffer = new StringBuffer();
		buffer.append(" <HTML> <HEAD> </HEAD> <BODY>");
		buffer.append("<STRONG> User name  : </STRONG>" + username);
		buffer.append(" <BR/> ");
		buffer.append("<STRONG> Counter </STRONG>: " + counter);
		buffer.append(" <BR/> ");
		buffer.append(" </BODY> </HTML> ");
		PrintWriter writer = response.getWriter();
		writer.print(buffer.toString());
	}
}