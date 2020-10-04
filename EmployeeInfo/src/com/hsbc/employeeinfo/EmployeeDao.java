package com.hsbc.employeeinfo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	GetDBConnecttion gdb = new GetDBConnecttion();
	EmpList emp = new EmpList();

	public void addEmployee(Employee e) {

		emp.addEmp(e);
		Connection conn = gdb.connect();

		try {
			Statement stmt = conn.createStatement();

			String sql = "insert into emplist values(" + e.id + ",'" + e.name + "'," + e.salary + ",'" + e.dept + "')";

			int i = stmt.executeUpdate(sql);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public List<Employee> getEmpList() {
		List<Employee> emplist = new ArrayList<>();
		emplist = emp.returnEmp();
		return emplist;
	}
}
