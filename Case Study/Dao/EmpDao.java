package com.trg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDao {
	static Connection conn = DatabaseConnection.getConnection();

	public static ResultSet getEmployees() {
		if (conn == null) {
			System.out.println("null object");
		}

		String str = "Select * from emp";
		PreparedStatement pst;
		try {
			pst = conn.prepareStatement(str);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {

				return rs;
			} else
				return null;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;

	}
	
	public static void pushEmployee(int id, String name, int salary, String department) {
		if (conn == null) {
			System.out.println("null object");
		}

		String str = "insert into emp values(?,?,?,?)";
		PreparedStatement pst;
		try {
			pst = conn.prepareStatement(str);
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setInt(3, salary);
			pst.setString(4, department);
			int rs = pst.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	

}
