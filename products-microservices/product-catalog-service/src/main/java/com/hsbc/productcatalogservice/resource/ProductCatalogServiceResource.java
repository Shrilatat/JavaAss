package com.hsbc.productcatalogservice.resource;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.productcatalogservice.dao.ProductCatalogServiceDao;
import com.hsbc.productcatalogservice.model.Product;

@RestController
public class ProductCatalogServiceResource {

	@Autowired
	ProductCatalogServiceDao dao;
	
	@RequestMapping("/categories/{category}")
	public List<Product> getProducts(@PathVariable("category") String category) {
		System.out.println(category);
		return dao.getProducts(category);
	}
}
