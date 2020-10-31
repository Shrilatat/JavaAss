package demo.sts.dbDemo;

import java.sql.*;

import org.apache.derby.jdbc.ClientDriver;

public class DbDemo {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new ClientDriver());
			Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/DemoDB");
//			System.out.println(conn);
			Statement stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
