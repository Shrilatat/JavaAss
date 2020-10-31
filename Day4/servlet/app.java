package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("unused")
@WebServlet("/app")
public class app extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	/*public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		Map<String, String> map = new HashMap<>();

		String sql1 = "select * from users";

		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB2");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql1);
			while (rs.next()) {
				map.put(rs.getString("uname"),rs.getString("pass"));
			}
			conn.close();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}*/

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		Map<String, String> db = new HashMap<>();
		
		resp.setContentType("text/html");
		//PrintWriter out = resp.getWriter();
		
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		db.put("aa", "aa");
		
		if (db.containsKey(uname)) {

			if (db.get(uname).equals(pass)) {

				req.getRequestDispatcher("success.jsp").forward(req, resp);
			} else
				req.getRequestDispatcher("fail.jsp").forward(req, resp);
		} else
			req.getRequestDispatcher("fail.jsp").forward(req, resp);
		
	}

}
