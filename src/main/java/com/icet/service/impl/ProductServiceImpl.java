package com.icet.service.impl;

import com.icet.dto.ProductDto;
import com.icet.entity.ProductEntity;
import com.icet.repository.ProductRepository;
import com.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;
    private final ObjectMapper mapper;

    @Override
    public void addProduct(ProductDto productDto) {
        ProductEntity productEntity = mapper.convertValue(productDto, ProductEntity.class);
        repository.save(productEntity);
    }

    @Override
    public List<ProductEntity> getProductById(String category) {
        return repository.findByCategory(category);
    }
}
