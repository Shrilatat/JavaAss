package com.hsbc.caseStudy1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	Connection conn = null;

	List<Employee> elist = new ArrayList<>();

	public EmpDao() {
		conn = DBConnection.getConnection();
	}

	public List<Employee> getAllEmp() throws SQLException {
		List<Employee> elist = new ArrayList<>();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from empinfo");

		while (rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			elist.add(new Employee(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
		}
		return elist;
	}

	public boolean deletEmp(String id) throws SQLException {
		PreparedStatement pst = conn.prepareStatement("delete from empinfo where eid=?");
		pst.setString(1, id);

		int f = pst.executeUpdate();
		if (f > 0) {
			System.out.println("Rows affected" + f);
			return true;
		} else {
			System.out.println("Rows affected =>  0");
			return false;
		}

	}

	boolean addEmp(String eeid, String eename, String esal, String edept) throws SQLException {
		String sql = "insert into empinfo values(?,?,?,?)";
		PreparedStatement pst = conn.prepareStatement(sql);

		pst.setString(1, eeid);
		pst.setString(2, eename);
		pst.setString(3, esal);
		pst.setString(4, edept);

		int f = pst.executeUpdate();
		if (f > 0) {
			System.out.println("Rows affected => " + f);
			return true;
		} else {
			System.out.println("Rows affected =>  0");
			return false;
		}

	}

}