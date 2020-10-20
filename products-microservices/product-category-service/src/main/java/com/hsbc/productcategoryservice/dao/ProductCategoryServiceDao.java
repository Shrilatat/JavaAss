package com.hsbc.productcategoryservice.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hsbc.productcategoryservice.model.Product;

@Repository
public class ProductCategoryServiceDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Map<String,Object>> getCategories() {
		return this.jdbcTemplate.queryForList("select * from categories");
	}
}
