package com.hsbc.employeeinfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckCredentials extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String username = req.getParameter("uname");
		String password = req.getParameter("pass");
		System.out.println(username + password);
		try {
			GetDBConnecttion gdb = new GetDBConnecttion();
			Connection conn = gdb.connect();

			Statement stmt = conn.createStatement();

			String sql = "select * from credentials";

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				if (username.equals(rs.getString(1)) && password.equals(rs.getString(2))) {
					RequestDispatcher rd = req.getRequestDispatcher("AccessPage.html");
					rd.forward(req, resp);
				} else {
					out.println("Invalid User!!");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
