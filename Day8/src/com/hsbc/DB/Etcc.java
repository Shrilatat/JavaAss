package com.hsbc.DB;
import java.sql.*;
//======TRANSACTION MANAGEMENT==============
public class Etcc {
	static Connection con = DBConnection.getConnection();
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Statement s = con.createStatement();
		try {
			con.setAutoCommit(false);
			s.executeUpdate("insert into emp values(9,'m',90909");
			s.executeUpdate("insert into emp values(9,'m',90909");
			con.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			con.rollback();
		}
		ResultSet rs = s.executeQuery("select * from emp");
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println(rsmd.getColumnCount());
	}

}
