package com.springwithMongo.springMongo.converters;

import com.springwithMongo.springMongo.commands.ProductForm;
import com.springwithMongo.springMongo.domain.Product;
import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class ProductFormToProduct implements Converter<ProductForm, Product>{

        public Product convert(ProductForm productForm) {
            Product product = new Product();
            if (productForm.getId()!= null && !StringUtils.isEmpty(productForm.getId())) {
                product.setId(new ObjectId(productForm.getId()));
            }
            product.setDescription(productForm.getDescription());
            product.setPrice(productForm.getPrice());
            product.setImageUrl(productForm.getImageUrl());
            return product;
        }


}
