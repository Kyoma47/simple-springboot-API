package com.flake.backendapi.controllers;

//import org.springframework.http.HttpStatus; 
//import org.springframework.http.ResponseEntity; 

import com.flake.backendapi.services.ProductService; 
import org.springframework.beans.factory.annotation.Autowired;
// for RestController : import org.springframework.web.bind.annotation.GetMapping;

import com.flake.backendapi.entities.Product;
import com.flake.backendapi.services.ProductService;

@RestController 
public class ProductController {

    @Autowired
    private ProductService productService; 

    // Insert a product into database : 
    @PostMapping("/product")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        Product savedProduct = productService.savedProduct( product ); 
        return new ResponseEntity<>(saveProduct, HttpStatus.CREATED);  
    }

    // Get a single product by it's ID :
    @GetMapping("/product")
    public ResponseEntity<Product> getProduct(@RequestParam(name = "productID") long productID){
        Product product = productService.getProduct( productID ); 
        return new ResponseEntity<>(saveProduct, HttpStatus.OK );  
    }

    // Get all the products in the table in our database : 
    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts( productID );  
    }

    // Update an existing product in the database :   
    @PatchMapping("/product")
    public ResponseEntity<Product> updateProduct(@RequestParam(name = "productID") long productID, @RequestBody Product product) {
        Product updatedProduct = productService.updateProduct(productID, product); 
        return new ResponseEntity<>(updatedProduct, HttpStatus.OK); 
    }

    // Delete an existing product in the database : 
    @DeleteMapping("/product")
    public ResponseEntity<Product> deleteProduct(@RequestBody(name = "productID") long productID) {
        Product deleteProduct = productService.deleteProduct(productID);
        return new ResponseEntity<>( deleteProduct, HttpStatus.OK);
    }

    // Get product by name using a raw SQL statement : 
    @GetMapping("/product-by-name")
    public List<Product> getProductsByName(@RequestParam(name = "productName") String productName){
        return productService.getProductsByName( productName );   
    }
}

