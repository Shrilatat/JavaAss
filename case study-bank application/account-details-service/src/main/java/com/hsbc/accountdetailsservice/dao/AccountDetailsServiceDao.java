package com.hsbc.accountdetailsservice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hsbc.accountdetailsservice.model.Account;

@Repository
public class AccountDetailsServiceDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Account getAccountById(int id) {
		return (Account)jdbcTemplate.queryForObject("select * from accounts where custId = ?", new Object[] {id}, (rs, rowNum) ->
        new Account(
                rs.getInt("accId"),
                rs.getInt("custId"),
                rs.getInt("bal")
        ));
	}
	
	
	
}
