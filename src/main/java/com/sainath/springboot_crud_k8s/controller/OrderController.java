package com.sainath.springboot_crud_k8s.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sainath.springboot_crud_k8s.entity.Order;
import com.sainath.springboot_crud_k8s.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping
    public Order addOrder(@RequestBody Order order){
    	System.out.println("Order details: "+order.getName());
        return service.addOrder(order);
       
    }

    @GetMapping
    public List<Order> getOrders(){
        return service.getOrders();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id){
        return service.getOrderById(id);
    }
}