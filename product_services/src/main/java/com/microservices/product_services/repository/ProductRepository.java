package com.microservices.product_services.repository;

import com.microservices.product_services.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.UUID;

public interface ProductRepository extends MongoRepository<Product, UUID> {
}
