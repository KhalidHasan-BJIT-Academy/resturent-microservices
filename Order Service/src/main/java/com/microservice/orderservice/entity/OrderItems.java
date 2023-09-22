package com.microservice.orderservice.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "order_items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID orderItemID;
    private String skuCode;
    private Double price;
    private Integer quantity;
}