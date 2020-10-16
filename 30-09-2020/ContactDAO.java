package com.trg.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ContactDAO {
	ContactBean myContact = new ContactBean();

	public boolean addNewContact(ContactBean cb) {
		Connection conn = DBConnection.getConnection();
		String myQuery = "INSERT INTO CONTACTS VALUES(?,?,?,?)";
		try {
			PreparedStatement prst = conn.prepareStatement(myQuery);
			prst.setString(1, cb.firstName);
			prst.setString(2, cb.lastName);
			prst.setString(3, cb.email);
			prst.setString(4, cb.telephone);
			int status = prst.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public ArrayList<ContactBean> getAddedContacts() {
		Connection conn = DBConnection.getConnection();
		String myQuery = "SELECT * FROM CONTACTS";
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(myQuery);
			ArrayList<ContactBean> contactList = new ArrayList<>();
			while(rs.next()) {
				ContactBean cb = new ContactBean();
				cb.firstName = rs.getString("FIRSTNAME");
				cb.lastName = rs.getString("LASTNAME");
				cb.email = rs.getString("EMAIL");
				cb.telephone = rs.getString("TELEPHONE");
				contactList.add(cb);
			}
			return contactList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
