package com.kodilla.good.patterns.challenges.productOrder;

public class Product {

    private String productName;
    private String productInformation;
    private double price;

    public Product(String productName, String productInformation, double price) {
        this.productName = productName;
        this.productInformation = productInformation;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: " +
                "productName: " + productName + '\'' +
                ", productInformation:" + productInformation + '\'' +
                ", price " + price +
                '}' + "GBP";
    }
}
