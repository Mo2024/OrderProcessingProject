package com.orderservice.model;

import jakarta.persistence.*;

import java.util.List;


@Entity

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "order_id")
//    private OrderedItem[] OrderedItems;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "ordered_items", // Join table name
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<OrderedItem> orderedItems;

    public Order(){}

    public Order(String productName, int quantity ){}

    public long getId() {
        return id;
    }


}

