package com.projects.practice.controllers;

import java.util.Arrays;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.practice.models.Product; // Ensure this is capitalized correctly
import com.projects.practice.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Ensure 'Product' (capital P) is used here
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/category")
    public List<Map<String, Object>> getCategoryProducts() {
        return Arrays.asList(
            Map.of("name", "Product 1", "Price", 123),
            Map.of("name", "Product 2", "Price", 234)
        );
    }
}
