package com.proshop.rest.service;

import com.proshop.rest.entity.Product;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> findAll() {
             List<Product> products = new ArrayList<>();

                Product p1 = new Product(new ObjectId("1"), "Airpods Wireless Bluetooth Headphones", "/images/airpods.jpg", "Bluetooth technology lets you connect it with compatible devices wirelessly High-quality AAC audio offers immersive listening experience Built-in microphone allows you to take calls while working", "Apple", "Electronics", new BigDecimal("89.99"), 10, 4.5, 12);
                Product p2 = new Product(new ObjectId("2"), "iPhone 11 Pro 256GB Memory", "/images/phone.jpg", "Introducing the iPhone 11 Pro. A transformative triple-camera system that adds tons of capability without complexity. An unprecedented leap in battery life", "Apple", "Electronics", new BigDecimal("599.99"), 7, 4.0, 8);
                Product p3 = new Product(new ObjectId("3"), "Cannon EOS 80D DSLR Camera", "/images/camera.jpg", "Characterized by versatile imaging specs, the Canon EOS 80D further clarifies itself using a pair of robust focusing systems and an intuitive design", "Cannon", "Electronics", new BigDecimal("929.99"), 5, 3.0, 12);
                Product p4 = new Product(new ObjectId("4"), "Sony Playstation 4 Pro White Version", "/images/playstation.jpg", "The ultimate home entertainment center starts with PlayStation. Whether you are into gaming, HD movies, television, music", "Sony", "Electronics", new BigDecimal("399.99"), 11, 5.0, 12);
                Product p5 = new Product(new ObjectId("5"), "Logitech G-Series Gaming Mouse", "/images/mouse.jpg", "Get a better handle on your games with this Logitech LIGHTSYNC gaming mouse. The six programmable buttons allow customization for a smooth playing experience", "Logitech", "Electronics", new BigDecimal("49.99"), 7, 3.5, 10);
                Product p6 = new Product(new ObjectId("6"), "Amazon Echo Dot 3rd Generation", "/images/alexa.jpg", "Meet Echo Dot - Our most popular smart speaker with a fabric design. It is our most compact smart speaker that fits perfectly into small space", "Amazon", "Electronics", new BigDecimal("29.99"), 0, 4.0, 12);

                products.add(p1);
                products.add(p2);
                products.add(p3);
                products.add(p4);
                products.add(p5);
                products.add(p6);

                return products;
    }
}
