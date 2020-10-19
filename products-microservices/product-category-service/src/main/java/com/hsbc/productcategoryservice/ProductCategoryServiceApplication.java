package com.hsbc.productcategoryservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ProductCategoryServiceApplication {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductCategoryServiceApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		runJDBC();
//	}
//	
//	void runJDBC() {
//		List<String> categoriesList = Arrays.asList("Laptop", "Tv", "Mobile", "Tablets", "Computers", "Gaming consoles");
//		jdbcTemplate.execute("DROP TABLE categories IF EXISTS");
//		jdbcTemplate.execute(
//				"CREATE TABLE categories(category VARCHAR(20))");
//		categoriesList.forEach(category-> {
//			jdbcTemplate.update("insert into categories (category) values(?)",
//					category);
//		});
		
	}


