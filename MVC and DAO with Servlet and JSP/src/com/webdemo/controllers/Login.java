package com.webdemo.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webdemo.dao.IUser;
import com.webdemo.dao.UserImplementation;
import com.webdemo.models.User;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("upass");
		boolean result = false;
		PrintWriter out = response.getWriter();
		out.println("<h1>Trying Something</h1>");	
	
		
		
		IUser userdao = new UserImplementation();
		if(userdao.validateUser(username, password))
			result=true;//out.println("<h1>Welcome </h1>"+username);
		else
			result=false;//out.println("<h1>Invalid User</h1>");	
		
		if(result==true)
		{	
			response.sendRedirect("index.html");
		}else {
			response.sendRedirect("register.html");
		}
		
		
}

}
