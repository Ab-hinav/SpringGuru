package com.springwithMongo.springMongo.controller;

import com.springwithMongo.springMongo.commands.ProductForm;
import com.springwithMongo.springMongo.converters.ProductToProductForm;
import com.springwithMongo.springMongo.domain.Product;
import com.springwithMongo.springMongo.repository.ProductRepository;
import com.springwithMongo.springMongo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    private final ProductService productService;
    private final ProductToProductForm productToProductForm;

    public ProductController(ProductService productService, ProductToProductForm productToProductForm) {
        this.productService = productService;
        this.productToProductForm = productToProductForm;
    }

    @GetMapping({"/products", "/products/list"})
    public String listProducts(Model model){
        model.addAttribute("products", productService.listAll());
        return "products/list";
    }

    @GetMapping("/products/show/{id}")
    public String getProduct(@PathVariable String id, Model model){
        model.addAttribute("product", productService.getById(id));
        return "products/show";
    }

    @RequestMapping("/")
    public String redirToList(){
        return "redirect:/product/list";
    }

    @PutMapping("/product/{id}/edit")
    public String edit(@PathVariable String id, Model model){
        Product product = productService.getById(id);
        ProductForm productForm = productToProductForm.convert(product);

        model.addAttribute("productForm", productForm);
        return "product/productform";
    }

    @DeleteMapping("/product/{id}/delete")
    public String delete(@PathVariable String id){
        productService.delete(id);
        return "redirect:/products/list";
    }

    @PostMapping("/product")
    public String saveOrUpdate(@Validated ProductForm productForm, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "product/productform";
        }

        Product savedProduct = productService.saveOrUpdateProductForm(productForm);

        return "redirect:/product/show/" + savedProduct.getId();
    }




}
