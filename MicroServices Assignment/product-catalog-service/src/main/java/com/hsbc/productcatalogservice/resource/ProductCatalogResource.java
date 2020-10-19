package com.hsbc.productcatalogservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.productcatalogservice.dao.ProductDao;
import com.hsbc.productcatalogservice.model.Product;

@RestController
@RequestMapping("productcatalog")
public class ProductCatalogResource {
	
	@Autowired
	ProductDao dao;
	
	@RequestMapping("/{category}")
	public List<Product> getProducts(@PathVariable("category") String category){
		return dao.getAllProducts(category);
	}
}
