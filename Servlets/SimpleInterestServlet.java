package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleInterestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html"); // send HTML response back (Compulsory two lines)
		PrintWriter out = resp.getWriter(); //send data back to browser
		
		int num1=Integer.parseInt(req.getParameter("t1"));
		int num2=Integer.parseInt(req.getParameter("t2"));
		int num3=Integer.parseInt(req.getParameter("t3"));
		
		out.print("<html>");
		out.print("<body>Simple Interest is: "+(num1*num2*num3)+"</body>");
		out.print("</html>");
	}

}
