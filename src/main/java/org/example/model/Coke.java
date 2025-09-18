package org.example.model;

public class Coke   extends ProductForSale {

    private String volume = "500ml";

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Volume: " + volume);
    }

}
