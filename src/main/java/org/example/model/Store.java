package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Chocolate", 2.5, "Delicious dark chocolate");
        products[1] = new Bread("Bread", 1.5, "Freshly baked bread");
        products[2] = new Coke("Coke", 1.0, "Refreshing soda");

        listProducts(products);
        //listProducts();
    }

    public static void listProducts(ProductForSale[] products) {

        for (ProductForSale product : products) {
            System.out.println("Type: " + product.getClass().getSimpleName());
            product.showDetails();
            System.out.println("Price: " + product.getSalesPrice(1));
            System.out.println("-----------------------");
        }
    }
}