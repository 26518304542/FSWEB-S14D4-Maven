package org.example.model;

public class Chocolate  extends ProductForSale {

    private String cocoaPercentage="70%";

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Cocoa Percentage: " + cocoaPercentage);
    }

}
