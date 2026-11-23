package com.icet.controller;

import com.icet.dto.ProductDto;
import com.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping()
    public void addProduct(@RequestBody ProductDto productDto){
        productService.addProduct(productDto);
    }

}
