package com.example.ProductServiceApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "api/products")
public class ProductControllor {

    @Value("${ourProd}")
    private String ourProd;

    @RequestMapping("/messages")
    public String tellMe() {
        System.out.println("It's the product who answered you!");
        return ourProd;
    }

    @GetMapping("/viewProducts")
    public List<Product> viewProducts() {
        return ProductRepository.viewAllProducts();
    }

    @GetMapping("/viewProducts/{nameP}")
    public List<Product> viewClientCommandByName(@PathVariable String nameP) {
        {
            return ProductRepository.productByName(nameP);
        }
    }
}