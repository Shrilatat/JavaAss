package com.webdemo.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webdemo.dao.IUser;
import com.webdemo.dao.UserImplementation;
import com.webdemo.models.*;

@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = request.getParameter("uname");
		String password = request.getParameter("upass");

		User user = new User(username,password);

		PrintWriter out = response.getWriter();
		out.println("<h1>Trying Something</h1>");		

		IUser userdao = new UserImplementation();
		if(userdao.registerUser(user))
			response.sendRedirect("index.html");
		else
			out.println("<h1>Invalid User</h1>");	
		
			
		
	}

}
