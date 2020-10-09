package com.hsbc;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AdditionServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter(); //out is to send to browser
		
		int str=Integer.parseInt(req.getParameter("num1"));
		int str1=Integer.parseInt(req.getParameter("num2"));
		int num3=str+str1;
		out.print("<html>");
		out.print("<body>Addition is: "+num3+" </body>");
		out.print("</html>");
}
}
