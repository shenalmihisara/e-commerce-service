package com.icet.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

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
    private Boolean isActive;

}
