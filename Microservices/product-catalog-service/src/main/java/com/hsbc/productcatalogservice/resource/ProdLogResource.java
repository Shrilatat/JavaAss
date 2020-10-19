/**
 * Author -Vishnu and Rohan 
 * 
 */
package com.hsbc.productcatalogservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.productcatalogservice.dao.ProductDao;
import com.hsbc.productcatalogservice.model.Product;
import com.hsbc.productcatalogservice.model.ProductList;

@RestController
@RequestMapping("catalog")
public class ProdLogResource {

	@Autowired
	ProductDao dao;

	@RequestMapping("/{catalogId}")
	public ProductList getProducts(@PathVariable("catalogId") String catalogId) {
		ProductList obj = new ProductList();
		List<Product> plist1 = dao.getAllProducts(catalogId);
		obj.setPlist(plist1);

		return obj;

	}

}
