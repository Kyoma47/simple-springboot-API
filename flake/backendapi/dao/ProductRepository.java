package com.flake.backendapi.dao;

import java.util.List;

import com.flake.backendapi.entities.Product; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query; 

public interface ProductRepository extends JpaRepository<Product,Long> {
    
    @Query(value = "SELECT * FROM product where name = ?1", nativeQuery = true)
    List<Product> getProductsByName(String productName);   
}