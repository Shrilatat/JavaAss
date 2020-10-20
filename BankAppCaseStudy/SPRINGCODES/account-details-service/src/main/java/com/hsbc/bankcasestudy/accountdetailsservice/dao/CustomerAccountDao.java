package com.hsbc.bankcasestudy.accountdetailsservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hsbc.bankcasestudy.accountdetailsservice.model.CustomerAccount;


@Repository
public class CustomerAccountDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public	CustomerAccount getCustomerAccountById(int id) {
		return (CustomerAccount) jdbcTemplate.queryForObject("select * from customeraccount where cid=?", new Object[] {id}, new BeanPropertyRowMapper(CustomerAccount.class));
	}
	
}
