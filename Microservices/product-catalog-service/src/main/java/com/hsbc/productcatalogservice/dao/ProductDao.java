package com.hsbc.productcatalogservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hsbc.productcatalogservice.model.Product;

@Repository
public class ProductDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Product> getAllProducts(String category){
		return jdbcTemplate.query("select * from products where category="+category, (rs, rowNum)-> new Product(rs.getString("productName"),rs.getString("description"),rs.getDouble("price")));
	}
}
