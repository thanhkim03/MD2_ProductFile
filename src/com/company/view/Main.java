package com.company.view;

import java.io.IOException;
import java.util.Scanner;

public class Main {

        public Main() throws IOException {
            Scanner scanner = new Scanner(System.in);
            ProductView productView = new ProductView();
            System.out.println("========================KNT SHOP================================");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiện ra sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            int chooseMenu = scanner.nextInt();
            switch (chooseMenu){
                case 1:
                    productView.formCreateProduct();
                    break;
                case 2:
                    productView.showListProduct();
                    break;
                case 3:
                    productView.deleteProduc();
                    break;
            }
        }
        public static void main(String[] args) throws IOException {
            // write your code here
            new Main();
        }
}
