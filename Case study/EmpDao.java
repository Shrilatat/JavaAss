package com.hsbc.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.DBConnection;
import com.hsbc.UserDetailBean;

public class EmpDao {

	Connection conn = DBConnection.getConnection();

	public Boolean addEmp(EmpBean ab) {
		try {
			int c = 0;
			String str = "Insert into employee values(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(str);
			pst.setInt(1, ab.getempId());
			pst.setString(2, ab.getempName());
			pst.setInt(3, ab.getempSal());
			pst.setString(4, ab.getempDept());
			pst.executeUpdate();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<EmpBean> selectEmp() {
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

	public Boolean deleteEmp(int id) {
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
} 