package com.management.book_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.book_system.entity.Product;
import com.management.book_system.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		List<Product> products = productService.getAllProducts();
		return products;
	}
	@PostMapping("/addProducts")
//	public List<Product> addProduct(@RequestBody Product newProduct) {
//	    productService.addProduct(newProduct); // Method to add the product to the list or database
//	    List<Product> products = productService.getAllProducts(); // Get the updated list of products
//	    return products; 
	public Product addProduct(@RequestBody Product newProduct) {
        return productService.addProduct(newProduct); // This returns a single Product
    }

}
