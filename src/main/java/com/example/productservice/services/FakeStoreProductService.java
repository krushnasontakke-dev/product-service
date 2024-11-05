package com.example.productservice.services;

import com.example.productservice.models.Product;
import org.springframework.stereotype.Service;

@Service
public class FakeStoreProductService implements ProductService{

    @Override
    public Product getProductById(Long id) {
        return null;
    }
}
