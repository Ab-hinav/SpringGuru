package com.springwithMongo.springMongo.service;

import com.springwithMongo.springMongo.commands.ProductForm;
import com.springwithMongo.springMongo.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();
    Product getById(String id);
    Product saveOrUpdate(Product product);
    void delete(String id);
    Product saveOrUpdateProductForm(ProductForm productForm);
}
