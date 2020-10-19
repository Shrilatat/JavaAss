package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCApp {
	public static void main(String[] args) {
		int empId = 103;

		try {
			

			Statement stmt = conn.createStatement();

//			stmt.executeUpdate(sql);
//			int i = stmt.executeUpdate(sql);

			ResultSet rs = stmt.executeQuery("select * from emp where empid ="+empId);
			rs.next();
			Employee e = new Employee(rs.getInt(1),rs.getString(2));
			
			System.out.println(e);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
