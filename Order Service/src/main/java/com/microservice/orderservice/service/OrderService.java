package com.microservice.orderservice.service;

import com.microservice.orderservice.dto.OrderItemsDto;
import com.microservice.orderservice.dto.OrderRequest;
import com.microservice.orderservice.entity.Order;
import com.microservice.orderservice.entity.OrderItems;
import com.microservice.orderservice.repository.OrderRopository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRopository orderRopository;
    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        List<OrderItems> orderItems=orderRequest.getOrderItemsDtolist()
                .stream()
                .map(this::mapToOrderItemDto)
                .toList();
        order.setOrderItemsList(orderItems);
        orderRopository.save(order);
    }

    private OrderItems mapToOrderItemDto(OrderItemsDto orderItemsDto) {
        OrderItems orderItems = new OrderItems();
        orderItems.setQuantity(orderItemsDto.getQuantity());
        orderItems.setPrice(orderItems.getPrice());
        orderItems.setSkuCode(orderItemsDto.getSkuCode());
        return orderItems;
    }
}
