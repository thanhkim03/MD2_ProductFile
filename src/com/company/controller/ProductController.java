package com.company.controller;

import com.company.model.Product;
import com.company.service.ProductServiceIMPL;

import java.io.IOException;
import java.util.List;

public class ProductController {
    ProductServiceIMPL productServiceIMPL = new ProductServiceIMPL();
    public List<Product> showFileProduct() throws IOException {
        return productServiceIMPL.findAll();
    }
    public void createProduct(Product product){
        productServiceIMPL.save(product);
    }
    public void deleteProduct(int id){
        productServiceIMPL.delete(id);
    }
}
