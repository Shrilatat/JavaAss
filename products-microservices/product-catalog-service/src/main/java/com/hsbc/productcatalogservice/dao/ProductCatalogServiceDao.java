package com.hsbc.productcatalogservice.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hsbc.productcatalogservice.model.Product;

@Repository
public class ProductCatalogServiceDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Product> getProducts(String category) {
		String sql = "select * from products where category='"+category+"'";
		//System.out.println(jdbcTemplate.query(sql,new Object[] {category}, new BeanPropertyRowMapper(Product.class)));
		//return jdbcTemplate.queryForList(sql,new Object[] {category}, new BeanPropertyRowMapper(Product.class));
		return jdbcTemplate.query(
	            sql,
	            (rs, rowNum) ->
	                    new Product(
	                            rs.getString("pname"),
	                            rs.getString("descp"),
	                            rs.getDouble("price")
	                    )
	    );
	}

}
