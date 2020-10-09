package com.trg.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.trg.DBConnection;

public class EmployeeAuthenticationDao {
Connection conn=null;
	
	public EmployeeAuthenticationDao() {
		conn= DBConnection.getConnection();
	}
	 public boolean Validation(String username,String password) throws SQLException  {
		 String sql="Select * from identify where username= '"+username+"'";
		 try {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			rs.next();
					if(rs.getString(2).equals(password)) {
						 return true;
					}
				
				}catch(SQLException e) {
					e.printStackTrace();
				}
			return false;

			/* String query = "select username,password from identify";
			    try (Statement stmt = conn.createStatement()) {
			      ResultSet rs = stmt.executeQuery(query);
			      while (rs.next()) {
			        String name = rs.getString("username");
			        String pass = rs.getString("password");
			        if(name==username && pass==password) {
			        	return true;
			        }
			      }
			    } catch (SQLException e) {
			      e.printStackTrace();
			    }
			    return false;*/
	} 
	 public void addEmp(int id,String name,int sal,String dept) {
		 try {
				String sql="Insert into detail values(?,?,?,?)";
				PreparedStatement pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, id);
				pstmt.setString(2,name);
				pstmt.setInt(3,sal);
				pstmt.setString(4,dept);
				pstmt.executeUpdate();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	 }

