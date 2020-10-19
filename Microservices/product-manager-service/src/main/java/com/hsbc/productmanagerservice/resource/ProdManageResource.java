package com.hsbc.productmanagerservice.resource;

/**
 * Author-Vishnu and Rohan
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hsbc.productmanagerservice.model.Category;
import com.hsbc.productmanagerservice.model.Product;
import com.hsbc.productmanagerservice.model.ProductList;

@RestController
@RequestMapping("/products")
public class ProdManageResource {

	@Autowired
	RestTemplate rt;

	@RequestMapping("/items")
	public List<Product> getProducts() {

		Category category = rt.getForObject("http://product-category-service/category/value", Category.class);

		System.out.println(category.getCatName());

		ProductList plist = rt.getForObject("http://product-catalog-service/catalog/" + category.getCatName(),
				ProductList.class);

		return plist.getPlist();

	}

}
