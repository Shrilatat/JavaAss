package com.abc.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmpDb {
	public static void main(String[] args) {
		Connection conn=DbConn.getConnection() ;
		Map<Integer,Employee> emps = new HashMap();
		Statement stmt=null;
		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM employee";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Employee em = new Employee();
				em.setId(rs.getInt(1));
				em.setName(rs.getString(2));
				em.setSalary((1.1*rs.getDouble(3)));
				em.setDoj(rs.getString(4));
				em.setDeptId(5);
				emps.put(em.getId(), em);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		Set<Integer> keys = emps.keySet();
		for (Integer key: keys) {
			System.out.println(key + " : "+ emps.get(key));
		}
	}
}
