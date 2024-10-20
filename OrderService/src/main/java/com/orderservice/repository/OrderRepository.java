package com.orderservice.repository;

import com.orderservice.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface  OrderRepository extends JpaRepository<Order, Integer> {

}
