package com.example.productservice.services;


import com.example.productservice.models.Category;
import com.example.productservice.models.Product;
import com.example.productservice.projections.ProductTitleAndDescription;
import com.example.productservice.repos.CategoryRepo;
import com.example.productservice.repos.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SelfProductService")
public class SelfProductService  implements ProductService{
    ProductRepo productRepo;

    private final CategoryRepo categoryRepo;

    public SelfProductService(ProductRepo productRepo, CategoryRepo categoryRepo) {
        this.productRepo = productRepo;
        this.categoryRepo = categoryRepo;
    }

    @Override
    public Product getProductById(Long id) {
        //return productRepo.findById(id).get();
        ProductTitleAndDescription productTitleAndDescription = productRepo.getProductTitleAndDesc(id);
        Product product = new Product();
        product.setTitle(productTitleAndDescription.getTitle());
        product.setDescription(productTitleAndDescription.getDescription());
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        Category category = product.getCategory();
        if(category.getId() ==  null) {
            Category savedCategory = categoryRepo.save(category);
            product.setCategory(savedCategory);
        }
        return productRepo.save(product);
    }
}
