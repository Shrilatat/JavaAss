package com.hsbc.trg;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class AllEmployeeDao {
	
	static Connection conn= DBConnection.getConnection();
	
	public String[][] ShowAllEmployee() {
		try {
			Statement stmt = conn.createStatement();
			Statement st= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String sql = "Select * from  EmployeeRegisteration";
			ResultSet rs = stmt.executeQuery(sql);
		    ResultSet rsrow = st.executeQuery("select * from EmployeeRegisteration");
		      //Moving the cursor to the last row
		    rsrow.last();
		    int rows= rsrow.getRow();
		    System.out.println("total Rows="+rows);
			String[][] arr = new String[rows][rs.getMetaData().getColumnCount()];
			int columnsNumber = rs.getMetaData().getColumnCount();
			int i=0;
			while (rs.next()) {
				
					for (int j=1; j <= columnsNumber; j++) {
					String columnValue = rs.getString(j);
					arr[i][j-1] = columnValue;
					System.out.println(columnValue);
					System.out.print("insideDaoAllEmployee");

					}
					i++;
				}

			
			conn.close();

			return arr;

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return null;

	}

}
