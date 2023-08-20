package com.proshop.rest.entity.order;

import com.proshop.rest.entity.AppUser;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document(collection = "orders")
public class Order {

    @Id
    private ObjectId id;

    @DBRef
    private AppUser user;

    @NotEmpty(message = "order item is required")
    @Size(min = 1, message = "order item must be greater than 1")
    @Valid
    private Set<OrderItem> orderItems;
}
