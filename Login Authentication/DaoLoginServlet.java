package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DaoLoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String a=req.getParameter("name");
		String b=req.getParameter("pass");
		System.out.println(a+b);
		DaoLogin check=new DaoLogin();
		try {
			if(check.verifyData(a,b)==true) {
				out.print("<HTML>");
				out.print("<body> Welcome onboard "+a+"</body>");
				out.print("</HTML>");
			}
			else {
				out.print("<HTML>");
				out.print("<body> Invalid Username or Password </body>");
				out.print("</HTML>");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
