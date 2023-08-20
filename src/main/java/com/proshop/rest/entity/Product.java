package com.proshop.rest.entity;


import jakarta.validation.constraints.NotBlank;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Document(collection = "products")
public class Product {

    @Id
    private ObjectId id;

    @NotBlank(message = "name is required")
    private String name;

    @NotBlank(message = "image is required")
    private String image;

    @NotBlank(message = "description is required")
    private String description;

    @NotBlank(message = "brand is required")
    private String brand;

    @NotBlank(message = "category is required")
    private String category;

    @NotBlank(message = "price is required")
    private BigDecimal price;

    @NotBlank(message = "count in stock is required")
    private Integer countInStock;

    @NotBlank(message = "rating is required")
    private Double rating;

    @NotBlank(message = "number of reviews is required")
    private Integer numReviews;

    private Date createdAt;
    private Date updatedAt;

    @DBRef
    private AppUser createdByAdminUser;

    @DBRef(lazy = true)
    private Set<Review> reviews;


    public Product(ObjectId id, String name, String image, String description, String brand, String category, BigDecimal price, Integer countInStock, Double rating, Integer numReviews) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.description = description;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.countInStock = countInStock;
        this.rating = rating;
        this.numReviews = numReviews;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

//    public void setCategory(String category) {
//        this.category = category;
//        category.setProduct(this);
//    }


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getCountInStock() {
        return countInStock;
    }

    public void setCountInStock(Integer countInStock) {
        this.countInStock = countInStock;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getNumReviews() {
        return numReviews;
    }

    public void setNumReviews(Integer numReviews) {
        this.numReviews = numReviews;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public AppUser getCreatedByAdminUser() {
        return createdByAdminUser;
    }

    public void setCreatedByAdminUser(AppUser createdByAdminUser) {
        this.createdByAdminUser = createdByAdminUser;
    }
}
