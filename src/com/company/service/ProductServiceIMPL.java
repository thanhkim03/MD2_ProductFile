package com.company.service;

import com.company.config.ConfigReadAndWriteFile;
import com.company.model.Product;

import java.io.IOException;
import java.util.List;

public class ProductServiceIMPL implements IProductService {
    public static String PATH ="D:\\MD2\\ProductFileDemo\\src\\com\\company\\data\\product.txt";
    public static List<Product> productList = ConfigReadAndWriteFile.readFromFile(PATH);
    @Override
    public List<Product> findAll() throws IOException {
        ConfigReadAndWriteFile.writeToFile(PATH,productList);
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId()==id){
                productList.remove(productList.get(i));
                i--;
            }
        }
    }

}
