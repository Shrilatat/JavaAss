package com.hsbc.productcatalogservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hsbc.productcatalogservice.model.Product;

@Repository
public class ProductDao {
	@Autowired
	JdbcTemplate jt;

	public List<Product> getAllProducts(String catalogName) {
		List<Product> b = jt.query("select * from product where cat=?", new Object[] { catalogName },
				new BeanPropertyRowMapper(Product.class));
		return b;
	}
}
