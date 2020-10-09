package com.hsbc.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.database.DBConnection;


public class EmpDao {

	Connection conn = DBConnection.getConnection();

	public Boolean addEmployee(EmpBean ub) {
		try {
			int c = 0;
			String str = "Insert into employee values(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(str);
			pst.setInt(1, ub.geteId());
			pst.setString(2, ub.geteName());
			pst.setInt(3, ub.geteSal());
			pst.setString(4, ub.geteDept());
			pst.executeUpdate();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<EmpBean> selectEmployees() {
		List<EmpBean> elist = new ArrayList<>();
		try {
			int c = 0;
			String str = "Select * from employee ";
			PreparedStatement pst = conn.prepareStatement(str);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int sal = rs.getInt(3);
				String dept = rs.getString(4);
				elist.add(new EmpBean(id, sal, name, dept));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return elist;
	}

	public Boolean deleteEmployee(int id) {
		try {
			int c = 0;
			String str = "Delete from employee values(?)";
			PreparedStatement pst = conn.prepareStatement(str);
			pst.setInt(1, id);
			pst.executeUpdate();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	Boolean validateUser(String ename, String epass) {
		try {
			String str = "Select * from emplogin where ename= ? and pass = ?";
			PreparedStatement pst = conn.prepareStatement(str);
			pst.setString(1, ename);
			pst.setString(2, epass);
			ResultSet rs = pst.executeQuery();
			if (rs.next())
				return true;
			else
				return false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
} 
