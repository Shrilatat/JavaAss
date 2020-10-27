package com.hsbc.productmanagementservice.resource;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hsbc.productmanagementservice.model.Product;

@RestController
@RequestMapping("products")
public class ProductManagementResource {
	
	public List<Product> getProducts(){
		String[] categories = {"Electronics","Tools","Clothes","Food"};
		RestTemplate restTemplate = new RestTemplate();
		List<Product> products= new ArrayList<>();
		
		return products.stream().map(prod -> {
			 Product product = restTemplate.getForObject("http://localhost:8081/productcatalog/"+categories[0], Product.class);
			 return new Product(product.getProductName(),product.getDescription(),product.getPrice());
		}).collect(Collectors.toList());
		
	}

}
