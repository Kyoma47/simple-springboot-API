package com.flake.backendapi.services;

import com.flake.backendapi.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service 
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;    

    public Product saveProduct(Product product) {
        return productRepository.save( product ); 
    }

    public Product saveProduct(long productID) {
        return productRepository.findbyId( productID ).orElseThrow(() -> new RuntimeException("not found 404 !")); 
    }
    
    public Product getProducts() {
        return productRepository.findAll(); 
    }
    
    public Product updateProduct(long productID, Product product) {
        Product existingProduct = productRepository.findById( productID ).orElseThrow(() -> new RuntimeException("not found 404 !"));
        existingProduct.setName( product.getName() ); 
        existingProduct.setDescription( product.getDescription() ); 
        existingProduct.setUnitPrice( product.getUnitPrice() ); 
        productRepository.save( existingProduct ); 
        return existingProduct ; 
    }

    public Product deleteProduct(long productID) {
        Product existingProduct = productRepository.findById( productID ).orElseThrow(() -> new RuntimeException("not found 404 !"));
        productRepository.deleteById( productID ); 
        return existingProduct ; 
    }

    public List<Product> getProductsByName(String productName) {
        return productRepository.getProductsByName(productName); 
    }
}