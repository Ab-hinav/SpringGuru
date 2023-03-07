package com.springwithMongo.springMongo.repository;

import com.springwithMongo.springMongo.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,String> {
}
