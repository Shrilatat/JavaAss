package pack_1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/logincheck")
public class validateServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String str1=req.getParameter("username");
		String str2=req.getParameter("password");
		
		Connection conn=null;
		Statement stmt=null;
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
			conn=DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB1");
			stmt = conn.createStatement();
			
			String sql="SELECT * FROM Login";
			ResultSet rs=stmt.executeQuery(sql);
			int flag1=0;
			int flag2=0;
			while(rs.next()) {
				if(str1.equals(rs.getString(1))) {
					flag1=1;
				}
				if(str2.equals(rs.getString(2))) {
					flag2=1;
				}	
			}		
			if(flag1==1 && flag2==1) {
				System.out.println("Login Successfull");
			}
			else if(flag1==1 && flag2==0) {
				System.out.println("Wrong Password");
			}
			else {
				System.out.println("Invalid User");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (conn != null)
					conn.close();
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
	}
}
