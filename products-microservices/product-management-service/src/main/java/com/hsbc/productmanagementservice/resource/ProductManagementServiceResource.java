package com.hsbc.productmanagementservice.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.hsbc.productmanagementservice.model.Product;

@RestController
public class ProductManagementServiceResource {

	@RequestMapping("/categories")
	public List<String> getCategories(Model model) {
		RestTemplate restTemplate = new RestTemplate();

		List<String> categories = restTemplate.getForObject("http://localhost:8081/categories/", List.class);
		//model.addAttribute("categories",categories);
		return categories;
		/*
		 * return ratings.stream().map(rating -> { Movie movie =
		 * restTemplate.getForObject("http://localhost:8082/movies/" +
		 * rating.getMovieId(), Movie.class); return new CatalogItem(movie.getName(),
		 * "Hardcoded Desc", rating.getRating()); }).collect(Collectors.toList());
		 */

	}

	@RequestMapping("/categories/{category}")
	public List<Product> getCategories(@PathVariable("category") String category) {
		RestTemplate restTemplate = new RestTemplate();

		List<Product> products = restTemplate.getForObject("http://localhost:8080/categories/" + category, List.class);

		return products;

	}
}
