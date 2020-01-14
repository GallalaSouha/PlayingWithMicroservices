package com.example.ProductServiceApplication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product , Integer> {
    @Query("select p from Product p where p.nameP like :name")
    public static List<Product> productByName(@Param("name") String mc) {
        return null;
    }

    @Query("select c from Product c  ")
    static List<Product> viewAllProducts() {
        return null;
    }

}
