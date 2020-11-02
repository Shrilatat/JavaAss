@WebServlet("/login")
public class loginWithDb extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String sql = "SELECT username,password FROM users WHERE username = '"+username+"'";
		Connection conn=null;
		Statement stmt=null;
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver()); //loading the driver.
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB2");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) { 
				if (rs.getString("password").equals(password))
					out.println("Welcome "+username);
				else 
					out.println("Invalid user or password.");
			} else {
				out.println("Invalid user or password.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {

			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}