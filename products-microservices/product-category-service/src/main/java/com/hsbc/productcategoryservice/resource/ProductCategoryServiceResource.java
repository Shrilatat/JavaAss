package com.hsbc.productcategoryservice.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.productcategoryservice.dao.ProductCategoryServiceDao;
import com.hsbc.productcategoryservice.model.Product;

@RestController
public class ProductCategoryServiceResource {
	
	@Autowired
	ProductCategoryServiceDao dao;

	@RequestMapping("/categories")
	public List<String> getCategories() {
		List<Map<String,Object>> categories = dao.getCategories();
		System.out.println(categories);
		List<String> finalList = new ArrayList<>();
		for (Map<String, Object> m : categories) {
		    for (Map.Entry<String, Object> e : m.entrySet()) {
		    	finalList.add((String) e.getValue());
		    }
		}
		return finalList;

	}
}
