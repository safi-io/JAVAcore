package com.basicsOOP.ArrayListGenerics;

public class Manager {
    public static void main(String[] args) {
        Inventory store = new Inventory();
        store.addProduct(new Product("Laptop", 500, 3));
        store.addProduct(new Product("Mobile", 300, 9));
        store.addProduct(new Product("Calculator", 12, 50));

        store.displayProduct();
        store.searchProduct("Laptop");
    }
}
