package com.hsbc.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

	public class OrderDao {
		Connection conn=null;
		public OrderDao() {
			conn= DBConnection.getConnection();
		}
		public Order getOrder(int num) throws SQLException {	
		Order o = new Order();
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select * from orders where onumber = '"+num+"'");
		System.out.println(rs.getString(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(4));
		o = new Order(rs.getInt(1), rs.getString(2), rs.getInt(3));
		return o;
	}		
}