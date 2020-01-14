package com.exemple.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.DAO.ProductRepository;
import com.exemple.Services.ServiceImp;
import com.exemple.entities.Product;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping( "api/products")
public class ProductController {
	@Autowired
    private ProductRepository productRepository;
	@Autowired
	private ServiceImp service;
	
	@PostMapping  
	public Product saveProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@GetMapping("/viewProducts")
	public List<Product> viewProducts() {
		
			List<Product>  Products = service.viewProducts();
			return Products;
		}
	
	@GetMapping("/viewProducts/{nom}")
	public List<Product> viewClientCommandByName(@PathVariable String nom) {
		
			List<Product>  products = service.researchProduct(nom);
			return products;
			
		
		
		}

}
