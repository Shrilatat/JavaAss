package com.trg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trg.dao.LoginDao;

public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
	    LoginDao dao = new LoginDao();
	    
	    String uname = req.getParameter("uname");
	    String pass = req.getParameter("pass");
	    if(dao.validate(uname, pass)) {
	    	RequestDispatcher rd = req.getRequestDispatcher("options.jsp");
	    	rd.forward(req, resp);
	    	
	    }
	    else {
	    
	    
	    out.print("<html>");
	    out.print("<body><h1>Login Failed! </h1></body>");
	    out.print("</html>");
	}

}}
