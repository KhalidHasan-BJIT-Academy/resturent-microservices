package com.microservice.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemsDto {
    private UUID orderItemID;
    private String skuCode;
    private Double price;
    private Integer quantity;
}
