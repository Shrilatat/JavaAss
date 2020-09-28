package com.hsbc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputFormServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//following 2 lines will be there in doGet every time
		resp.setContentType("text/ html"); 
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String passwd = req.getParameter("pass");
		String Gender = req.getParameter("r1");
		int age = Integer.parseInt( req.getParameter("age"));
		String[] lang = req.getParameterValues("lang");
		out.print("<html>");
		out.print("<body> <h1> Details</h1> </body> ");
		out.print("<table border = '1' bgcolor = 'lightblue'>");
		out.print("<tr> <th> Name</th>  <th> "+name+"</th> </tr>");
		out.print("<tr> <td> Gender</td>  <td> "+Gender+"</td> </tr>");
		out.print("<tr> <td> Age</td>  <td> "+age+"</td> </tr>");
		out.print("<tr> <td> Languages</td><td> shown in follwing list</td> </tr>");
		for(int i=0;i< lang.length;i++ )
		{
			out.print("<ul>" + lang[i]+"</ul>"); 
		}
	
		out.print("</table>");
		out.print("</html>");
		
	}
	
}
