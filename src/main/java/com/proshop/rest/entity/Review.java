package com.proshop.rest.entity;

import jakarta.validation.constraints.NotBlank;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "reviews")
public class Review {

    @Id
    private ObjectId id;

    @NotBlank(message = "user name is required")
    private String name;

    @NotBlank(message = "user name is required")
    private Double rating;

    @NotBlank(message = "user name is required")
    private String comment;

    private Date createdAt;

    public Review(ObjectId id, String name, Double rating, String comment, Date createdAt) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.comment = comment;
        this.createdAt = createdAt;
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

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
