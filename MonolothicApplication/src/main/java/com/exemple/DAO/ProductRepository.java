package com.exemple.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exemple.entities.Product;


@Repository 
public interface ProductRepository extends JpaRepository<Product,Long> {
	@Query("select c from Product c  ")
	public List<Product> viewAllProducts();
	@Query("select c from Product c where c.nameP=:x ")
	public List<Product> researchByNameP(@Param("x") String nameP);

}
