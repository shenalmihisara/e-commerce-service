package com.icet.service;

import com.icet.dto.ProductDto;
import com.icet.entity.ProductEntity;

import java.util.List;

public interface ProductService {

    void addProduct(ProductDto productDto);

    ProductDto getProductById(Integer id);

    List<ProductEntity> getProductByCatogery(String category);

    List<ProductEntity> getAllProducts();
}
