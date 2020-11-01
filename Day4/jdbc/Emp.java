package Day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;


public class Emp {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		Map<Integer, Employee> record = new HashMap<>();
		int id = 1;
		/*
		ij> select * from emp;
		NAME                |DEPT                |SUBJECT             |SALARY
		--------------------------------------------------------------------------
		Aayush              |CS                  |Network             |10000
		Aman                |CH                  |Fluid               |9000
		Kamal               |CE                  |CFD                 |9500
		*/
		String sql1 = "select * from emp";
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB2");
			stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(sql1);
			
			while (rs.next()) {
				System.out.println(rs.getString(1) + " : " + rs.getString(2) + " : " + rs.getString(3) + " : " + rs.getInt(4));
				Employee temp = new Employee((rs.getInt(4)*1.1), rs.getString(1), rs.getString(2), rs.getString(3));
				record.put(id, temp);
				id++;
			}
			
			System.out.println("----------------------");
			System.out.println("After Update");
			
			for(Map.Entry m : record.entrySet()){  
				System.out.println(m.getKey() +" : "+m.getValue());
			}
			conn.close();		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
