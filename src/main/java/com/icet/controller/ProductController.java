package com.icet.controller;

import com.icet.dto.ProductDto;
import com.icet.entity.ProductEntity;
import com.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping()
    public void addProduct(@RequestBody ProductDto productDto){
        productService.addProduct(productDto);
    }

    @GetMapping("/category/{category}")
    public List<ProductEntity> getProductsByCategory(@PathVariable String category){
        return productService.getProductById(category);
    }
}
