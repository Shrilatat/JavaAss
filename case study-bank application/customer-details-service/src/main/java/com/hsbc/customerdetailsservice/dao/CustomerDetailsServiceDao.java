package com.hsbc.customerdetailsservice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hsbc.customerdetailsservice.model.Customer;

@Repository
public class CustomerDetailsServiceDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Customer getCustomerById(int id) {
		return (Customer)jdbcTemplate.queryForObject("select * from customers where custId = ?", new Object[] {id}, (rs, rowNum) ->
        new Customer(
                rs.getInt("custId"),
                rs.getString("custName"),
                rs.getString("custAddress")
        ));
	}
	
	public Customer postCustomer(Customer customer) {
		String sql = "insert into customers(custId,custName,custAddress) values (?,?,?)";
		jdbcTemplate.update(sql,new Object[] {customer.getCustId(),customer.getCustName(),customer.getCustAddress()});
		return customer;
	}
}
