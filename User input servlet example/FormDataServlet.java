package com.hsbc.servletdemo.ex2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormDataServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String name=req.getParameter("name");
		String pwd=req.getParameter("pass");
		String radio=req.getParameter("r1");
		
		String[] checked = req.getParameterValues("c1");
		
		String check=req.getParameter("age");
		
		System.out.println(name);
		System.out.println(pwd);
		System.out.println(radio);
		String str=String.join(",", checked);
		if(check.equals("1"))
			check="< 1 years";
		if(check.equals("2"))
			check="1 - 15 years";
		if(check.equals("3"))
			check="15-30 years";
		
		out.print("<html>");
		out.print("<body>");
		out.print("<table border=1 width=50% height=50%>");  
        out.print("<tr><td>Name</td><td>"+name+"</td><tr>");
        out.print("<tr><td>Gender</td><td>"+radio+"</td><tr>");
        out.print("<tr><td>Age</td><td>"+check+"</td><tr>");
        out.print("<tr><td>Languages known</td><td>"+str+"</td><tr>");
		out.print("<html>");

}
}
