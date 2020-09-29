package com.trg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayFormServlet extends HttpServlet{

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
	    PrintWriter out=resp.getWriter();
	    String str[]=req.getParameterValues("languages");
	   String s2="";
	   for(String s:str) {
		   s2=s2+s+",";
	   }String name=req.getParameter("name");
	    String password=req.getParameter("password");
	    String gender=req.getParameter("gender");
	    String age=req.getParameter("age");
	    String[] languages=req.getParameterValues("languages");
	    String instructions=req.getParameter("instruction");
	    String lang="";
	    for(String s1:languages) {
	    	lang=lang+str+",";
	    }
	    out.print("<html><head><style>\r\n" + 
	    		"table, th, td {\r\n" + 
	    		"  border: 1px solid black;\r\n" + 
	    		"  border-collapse: collapse;\r\n" + 
	    		"}\r\n" + 
	    		"</style> </head>");
	    out.print("<body><table width = \"100%\"><tr><td>name:</td><td>"+name+"</td></tr><br>" );
	    out.print("<tr><td>password:</td><td>"+password+"</td></tr><br>");
	    out.print("<tr><td>gender:</td><td>"+gender+"</td></tr><br>");
	    out.print("<tr><td>age:</td><td>"+age+"</td></tr><br>");
	    out.print("<tr><td>Languages:</td><td>"+lang+"</td></tr><br>");
	    out.print("</table></body></html>");
	        
	    }
}

