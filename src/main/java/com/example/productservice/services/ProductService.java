package com.example.productservice.services;

import com.example.productservice.models.Product;
import org.springframework.stereotype.Service;


public interface ProductService {
    Product getProductById(Long id);
}
