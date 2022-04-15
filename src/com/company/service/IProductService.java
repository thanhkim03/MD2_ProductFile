package com.company.service;

import com.company.model.Product;

import java.io.IOException;
import java.util.List;

public interface IProductService {
    List<Product> findAll() throws IOException;
    void save(Product product);
    void delete(int id);
}
