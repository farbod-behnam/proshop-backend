package com.proshop.rest.entity.order;

import com.proshop.rest.entity.Product;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("order_items")
public class OrderItem {

    @Id
    private ObjectId id;

    @NotBlank(message = "name is required")
    private String productName;

    @NotNull(message = "quantity is required")
    @Min(value = 1, message = "quantity must be greater than or equal to 1")
    @Max(value = 1000, message = "quantity must be less than or equal to 1000")
    private Integer quantity;

    private Double price;

    @NotNull(message = "product is required")
    @DBRef(lazy = true)
    private Product product;
}
