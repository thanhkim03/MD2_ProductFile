package com.company.config;

import com.company.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConfigReadAndWriteFile {
        public static List<Product> readFromFile(String path){
            List<Product> productList = new ArrayList<>();
            try {
                FileInputStream fileInputStream = new FileInputStream(path);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                productList = (List<Product>) objectInputStream.readObject();
                fileInputStream.close();
                objectInputStream.close();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            return productList;
        }
        public static void writeToFile(String path, List<Product> studentList) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(studentList);
                fileOutputStream.close();
                objectOutputStream.close();
            } catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }
    }
