package com.microservice.orderservice.repository;

import com.microservice.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRopository extends JpaRepository<Order, UUID> {
}
