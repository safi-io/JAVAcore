package com.basicsOOP.ArrayListGenerics;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProduct() {
        for (Product product : products) {
            System.out.println(product.getProductName() + " Price:" + product.getProductPrice() + " Quantity:" + product.getProductQuantity());
        }
    }

    public void searchProduct(String name) {
        boolean search = false;
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(name)) {
                System.out.println(product.getProductQuantity());
                search = true;
                break;
            }
        }
        if(!search) {
            System.out.println("Product Not Found");
        }
    }
}
