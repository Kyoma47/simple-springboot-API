package com.flake.backendapi.dao;

import com.flake.backendapi.model.Product; 
import org.springframework.data.jpa.repository.JpaRepository; 

public class ProductRepository extends JpaRepository<Product,Long> {
    
    @Query(value = "SELECT * FROM product where name = ?1", nativeQuery = true)
    List<Product> getProductsByName(String productName);   
}