package com.flake.backendapi.entities;

import lombok.Data; 

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Long id ;

    @Column(nullable = false, unique = true)
    private String name;

    private String description;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;
    
    /*
    @Column(name = "sell_count")
    private int sellCount;


    private Integer stock; // can be null, if not speficied by Othmane

    @Column(name = "img_url")
    private String imgURL;
    */

    public void setName(String name){
        this.name = name ; 
    } 
    public String getName() {
        return this.name ; 
    }
    
    public void setDescription(String description){
        this.description = description ; 
    } 
    public String getDescription() {
        return this.description ; 
    }
    
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice ; 
    }
    public BigDecimal getUnitPrice() {
        return this.unitPrice ; 
    } 
}
