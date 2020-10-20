package com.hsbc.bankcasestudy.bankmanagerservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hsbc.bankcasestudy.bankmanagerservice.model.Customer;





@Repository
public class CustomerDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public	List<Customer> getCustomerById(int id) {
		return jdbcTemplate.query("select * from customer where id="+id, (rs, rowNum)-> new Customer(rs.getInt("customerId"), rs.getString("customerName"), rs.getString("address")));
	}
	
	public int createCustomer(Customer c) {
		return jdbcTemplate.update("insert into customer (id, name, address) values(?,?,?)",c.getCustomerId(),c.getCustomerName(),c.getAddress());
	}
}
