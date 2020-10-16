package firstservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.DataAccessObject;

public class LoginServlet extends HttpServlet {
	DataAccessObject d = new DataAccessObject();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		try {
			if (d.sendCredentials(username, password)) {
				out.print("<html>");
				out.print("<body><h1>Login Successful</h1></body>");
				out.print("</html>");
			} else {
				out.print("<html>");
				out.print("<body><h1>Login Failed</h1></body>");
				out.print("</html>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}