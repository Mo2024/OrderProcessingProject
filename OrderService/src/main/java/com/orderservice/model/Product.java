package com.orderservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String productName;
    private double price;

    public Product(){}

    public Product(String productName, int price){
        this.productName = productName;
        this.price = price;

    }

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
