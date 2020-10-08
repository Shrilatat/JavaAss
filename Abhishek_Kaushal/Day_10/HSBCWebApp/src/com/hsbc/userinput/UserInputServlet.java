package com.hsbc.userinput;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.login.LoginDao;

public class UserInputServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		String age = req.getParameter("age");
		String[] languages = req.getParameterValues("languages");
		String instructions = req.getParameter("instructions");
		String lang = "";
		for(String str : languages)
		{
			lang = lang + str + ",";
		}
		
		out.print("<html>");
		out.print("<body>"
				+ "<table border = 1>"
				+ "<tr><td>Name</td><td>" + name + "</td></tr>"
				+ "<tr><td>Gender</td><td>" + gender + "</td></tr>"
				+ "<tr><td>Age</td><td>" + age + "</td></tr>"
				+ "<tr><td>Languages Known</td><td>" + lang + "</td></tr>"
				+ "</table>"
				+ "</body>");
		out.print("</html>");
		
	}
	
	
}
