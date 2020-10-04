package com.hsbc.employeeinfo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GetEmpDetailsFromDB {
	GetDBConnecttion gdb = new GetDBConnecttion();
	

	public List<Employee> getEmpDetails() {
		List<Employee> emplist = new ArrayList<>();
		Connection conn = gdb.connect();
		String sql = "select * from emplist";
		try {
			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				Employee temp= new Employee();
				temp.id=rs.getInt(1);
				temp.name=rs.getString(2);
				temp.salary=rs.getInt(3);
				temp.dept=rs.getString(4);
				emplist.add(temp);
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return emplist;
	}
}
