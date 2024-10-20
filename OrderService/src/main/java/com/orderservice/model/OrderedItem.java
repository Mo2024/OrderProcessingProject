package com.orderservice.model;

import jakarta.persistence.Entity;

@Entity
public class OrderedItem {

    private int quantity;

    public OrderedItem(){}

    public OrderedItem(int quantity){}

}
