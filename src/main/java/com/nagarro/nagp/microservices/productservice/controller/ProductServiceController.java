package com.nagarro.nagp.microservices.productservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.microservices.productservice.model.Product;

@RestController
public class ProductServiceController {

	@Autowired
	Environment env;

	/**
	 * Gets the products.
	 *
	 * @return the products
	 */
	@GetMapping(value = "/products")
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<>();
		Product p1 = new Product(1, "a", 10D, "a", 1);
		p1.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		Product p2 = new Product(2, "b", 20D, "b", 2);
		p2.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		products.add(p1);
		products.add(p2);

		return products;
	}

}
