package com.company.model;

import java.io.Serializable;

public class Product implements Serializable {
    public int id;
    public String product ;
    public String productCompany ;
    public int price ;

    public Product(int id, String product, String productCompany, int price) {
        this.id = id;
        this.product = product;
        this.productCompany = productCompany;
        this.price = price;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", productCompany='" + productCompany + '\'' +
                ", price=" + price +
                '}';
    }
}
