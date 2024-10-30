package com.sainath.springboot_crud_k8s.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "ORDERS_TBL")
public class Order {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int qty;
    private double price;
}