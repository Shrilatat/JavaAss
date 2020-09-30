package com.hsbc.assignments1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserInputServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String age = req.getParameter("age");
		String lang[] = req.getParameterValues("lang");
		String instruction = req.getParameter("instruction");
		
		StringBuffer str = new StringBuffer();
		for (String string : lang) {
			str.append(string + " ");
		}

		out.print("<html><body bgcolor=\"lightgrey\">");
		out.println("<table border=1>");  
		out.println("<tr><td>Name</td><td>" + name);
		out.println("<tr><td>Gender</td><td>" + gender);
		out.println("<tr><td>Age</td><td>" + age);
		out.println("<tr><td>Lang</td><td>" + str);
		out.println("<tr><td>Instruction</td><td>" + instruction);
		out.println("</table>");  
		out.println("</html></body>"); 

	}
}