package com.kodilla.good.patterns.challenges.foodchallenge.productDataBase;

import com.kodilla.good.patterns.challenges.foodchallenge.supplier.FoodSupplier;

public class Product {

    private String productName;
    private String description;
    private double price;
    private FoodSupplier foodSupplier;


    public Product(String productName, String description) {
        this.productName = productName;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product: " + productName + '\'' +
                " description :" + description + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productName != null ? !productName.equals(product.productName) : product.productName != null) return false;
        return description != null ? description.equals(product.description) : product.description == null;
    }

    @Override
    public int hashCode() {
        int result = productName != null ? productName.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
