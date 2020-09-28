package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 
 * @author suryavanshi
 *
 */

public class CheckboxServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String str[] = req.getParameterValues("courses");
		
		out.print("<html>");
		out.print("<body><h1>Checkbox values are "  + "</h1></body>");
		
		for (String string : str) {
//			System.out.println(string);
			out.print(string + "<br>");
		}
		
		
		out.print("</html>");
	}

}
