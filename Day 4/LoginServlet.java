package com.demo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")

public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		String u  = req.getParameter("username");
		String p  = req.getParameter("password");

		if(u.equals("Ash") && p.equals("Ash@007"))
			out.println("<h1>" + "Login Successful" +  "</h1>");
		else
			out.println("<h1>" + "Wrong Password or Username" + "</h1>");
	}
}
