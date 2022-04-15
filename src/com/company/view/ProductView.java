package com.company.view;

import com.company.controller.ProductController;
import com.company.model.Product;
import com.company.service.ProductServiceIMPL;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    Scanner scanner = new Scanner(System.in);
    List<Product> productList = ProductServiceIMPL.productList;
    ProductController productController = new ProductController();

    public void showListProduct() throws IOException {

        if (productList.size()==0){
            System.out.println("đã hết hàng");
        }
        else   System.out.println(productController.showFileProduct());
        System.out.println("ấn end để về Menu");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("end")) {
            new Main();
        }
    }

    public void formCreateProduct() throws IOException {
        while (true) {
            int id;
            if (productList.size() == 0) {
                id = 1;
            } else {
                id = productList.get(productList.size() - 1).getId() + 1;
            }
            System.out.println("Tên sản phẩm: ");
            String product = scanner.nextLine();
            System.out.println("Hãng sản phẩm: ");
            String productCompany = scanner.nextLine();
            System.out.println("Giá sản phẩm: ");
            int price = Integer.parseInt(scanner.nextLine());
            Product products = new Product(id,product,productCompany,price);
            productController.createProduct(products);
            System.out.println("Nhấn end để về menu hoặc enter để tiếp tục");
            String backMenu = scanner.nextLine();
            if (backMenu.equalsIgnoreCase("end")) {
                new Main();
            }
        }

    }
    public void deleteProduc() throws IOException {
       while (true){
           Scanner scanner = new Scanner(System.in);
           System.out.println("Nhập id mã hàng cần xóa: ");
           int id = scanner.nextInt();
           productController.deleteProduct(id);
           System.out.println("Nhấn end để về menu hoặc enter để tiếp tục");
           String back = scanner.next();
           if (back.equalsIgnoreCase("end")) {
               new Main();
    }
}
    }
}