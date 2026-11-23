package com.icet.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "product")
@Data
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private double price;
    private Integer qty;
    private String category;
    private String brand;
    private String productCondition;
    private String imgUrl;
    private String sellerName;
    private String location;
    private boolean isActive;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @PrePersist
    protected void onCreate(){
        createdAt = LocalDate.now();
        updatedAt = LocalDate.now();
    }

    @PreUpdate
    protected void onUpdate(){
        updatedAt = LocalDate.now();
    }

}
