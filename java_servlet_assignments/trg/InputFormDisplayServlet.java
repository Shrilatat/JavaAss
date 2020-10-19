
package com.hsbc.trg;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class  InputFormDisplayServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		String gen=req.getParameter("gen");
		String[] lang=req.getParameterValues("lang");
		String instruct=req.getParameter("instruct");
		
		out.print("<html>");
		out.print("<body><table border='1' cellpadding='0' cellspacing='0'> <tr><td>Name</td><td>"+name+"</td></tr>"
				+ "<tr><td>Gender</td><td>"+gen+"</td></tr><tr><td>Instructions</td><td>"+instruct+"</td></tr>"
					
						+ "</table></body>");
		out.print("<html>");
		
	}
	
	

}
