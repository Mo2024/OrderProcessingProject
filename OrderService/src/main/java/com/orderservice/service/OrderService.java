package com.orderservice.service;

import com.orderservice.model.Order;
import com.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
        @Autowired
        private OrderRepository orderRepository;

        public List<Order> getAllOrders(){
            return orderRepository.findAll();
        }

        public Order createOrder(Order order){
            return orderRepository.save(order);
        }
}
