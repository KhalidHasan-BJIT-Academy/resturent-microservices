package com.microservices.product_services.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private UUID productID;
    private String name;
    private String description;
    private Double price;
}