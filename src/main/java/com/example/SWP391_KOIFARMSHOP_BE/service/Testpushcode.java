package com.example.SWP391_KOIFARMSHOP_BE.service;

import com.example.SWP391_KOIFARMSHOP_BE.model.ProductRequest;
import com.example.SWP391_KOIFARMSHOP_BE.model.ProductResponse;
import com.example.SWP391_KOIFARMSHOP_BE.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Testpushcode {
    @Autowired
    private Product product;

    public ProductResponse test(ProductRequest productRequest) {
        ProductResponse p = new ProductResponse();
        if (productRequest.getBreed().isBlank()) {
            System.out.println("Breed is missing in the request.");
        }
        return p;
    }

}
