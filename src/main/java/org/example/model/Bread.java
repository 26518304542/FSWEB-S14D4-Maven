package org.example.model;

public class Bread extends ProductForSale {

    private String breadType = "Whole Wheat";

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Bread Type: " + breadType);
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    

}
