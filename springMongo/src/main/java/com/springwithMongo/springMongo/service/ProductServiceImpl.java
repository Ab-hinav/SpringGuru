package com.springwithMongo.springMongo.service;

import com.springwithMongo.springMongo.commands.ProductForm;
import com.springwithMongo.springMongo.domain.Product;
import com.springwithMongo.springMongo.repository.ProductRepository;
import org.springframework.stereotype.Service;
import com.springwithMongo.springMongo.converters.ProductFormToProduct;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;
    private final ProductFormToProduct ProductFormToProduct;

    public ProductServiceImpl(ProductRepository productRepository, ProductFormToProduct ProductFormToProduct) {
        this.productRepository = productRepository;
        this.ProductFormToProduct = ProductFormToProduct;
    }

    @Override
    public List<Product> listAll() {
        List<Product> products = (List<Product>) productRepository.findAll();
        return products;
    }

    @Override
    public Product getById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product saveOrUpdate(Product product) {
        try {
            productRepository.save(product);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return product;
    }

    @Override
    public void delete(String id) {
        try {
            productRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product saveOrUpdateProductForm(ProductForm productForm) {

        Product savedProduct = saveOrUpdate(ProductFormToProduct.convert(productForm));
        System.out.println("Saved Product Id: " + savedProduct.getId());
        return savedProduct;

    }
}
