package com.microservice.orderservice.dto;

import com.microservice.orderservice.entity.OrderItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private List<OrderItemsDto> orderItemsDtolist;
}
