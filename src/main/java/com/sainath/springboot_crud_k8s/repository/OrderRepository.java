package com.sainath.springboot_crud_k8s.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sainath.springboot_crud_k8s.entity.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}