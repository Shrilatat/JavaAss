package Derrby;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo {
	static Connection conn = DBConnection.getConnection();
	
	public static void main(String[] args) throws SQLException {
		String sql1 = "insert into emp values (111, 'Aditi', 9000)";
		String sql2 = "insert into emp values (222, 'BAditi', 9000)";
		String sql3 = "insert into emp values (333, 'CAditi', 9000)";
		String sql4 = "insert into emp values (444, 'Dditi', 9000)";
		String sql5 = "select * from emp";
		int empId = 111;
		String sql6 = "select*  from emp where empid = "+ empId;
		
		//try block
		
		conn.setAutoCommit(false);//by default is true
			//All the atomic instructions , all or none
		conn.commit();//saved on db
		
		
		//catch block
		conn.rollback();//comes in catch block
		
		
		
		
//			System.out.println(conn);
//			
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//			
//			Employee e2 = new Employee(567,"bharat",9876);
//			stmt.executeQuery(e2.addEmp());
//			
			
			//stmt.executeUpdate(sql4);
			
			ResultSet rs = stmt.executeQuery(sql5);
//			rs.next();
//			Employee e1 = new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3));
//			System.out.println(e1);
//			while(rs.next())
//			{
//			System.out.print(rs.getInt(1)+" - ");
//			System.out.print(rs.getString(2)+" - ");
//			System.out.println(rs.getInt(3)+" - ");
//			System.out.println("-------------------------");
//			}
			
			
			
			
			
//			ResultSetMetaData ------ getColumnCount
//							---------getColumnLabel(1)
//							---------
							
			DatabaseMetaData dbmd= conn.getMetaData();
			System.out.println(dbmd	);
//			
			
			
			
			
			//rs.first();
//			System.out.print(rs.getInt(1)+" - ");
//			System.out.print(rs.getString(2)+" - ");
//			System.out.println(rs.getInt(3)+" - ");
//			System.out.println("-------------------------");
//			
//			rs.last();
//			System.out.print(rs.getInt(1)+" - ");
//			System.out.print(rs.getString(2)+" - ");
//			System.out.println(rs.getInt(3)+" - ");
//			System.out.println("-------------------------");
//			
//			rs.previous();
//			System.out.print(rs.getInt(1)+" - ");
//			System.out.print(rs.getString(2)+" - ");
//			System.out.println(rs.getInt(3)+" - ");
//			System.out.println("-------------------------");
//			//System.out.println(count);
			
		} 
	}

