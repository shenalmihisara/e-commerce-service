package com.icet.service;

import com.icet.dto.ProductDto;
import com.icet.entity.ProductEntity;

import java.util.List;

public interface ProductService {

    void addProduct(ProductDto productDto);

    List<ProductEntity> getProductById(String category);
}
