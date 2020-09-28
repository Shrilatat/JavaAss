package com.hsbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.db.DBConnection;
import com.hsbc.db.LoginDao;
/**
 * 
 * @author suryavanshi
 *
 */
public class ValidateServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String name = req.getParameter("name");
		String password = req.getParameter("password");

		LoginDao dao = new LoginDao();

		if(dao.validate(name,password)) {
			out.print("<html>");
			out.print("<body><h1>Login Success. Welcome " + name +"</h1></body>");
			out.print("</html>");
		}
		else {
			out.print("<html>");
			out.print("<body><h1>Login Failed !! " + "</h1></body>");
			out.print("</html>");
		}
	}
}
