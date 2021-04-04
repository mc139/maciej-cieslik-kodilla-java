package com.kodilla.good.patterns.challenges.foodchallenge.orders;

import com.kodilla.good.patterns.challenges.foodchallenge.productDataBase.Product;
import com.kodilla.good.patterns.challenges.foodchallenge.supplier.FoodSupplier;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private int invoiceNumber;
    private FoodSupplier foodSupplier;
    private List<Product> productList;
    private LocalDateTime dateTime;
    private boolean isPaid;

    public Order(int invoiceNumber, FoodSupplier foodSupplier, List<Product> productList, LocalDateTime dateTime, boolean isPaid) {
        this.invoiceNumber = invoiceNumber;
        this.foodSupplier = foodSupplier;
        this.productList = productList;
        this.dateTime = dateTime;
        this.isPaid = isPaid;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public FoodSupplier getFoodSupplier() {
        return foodSupplier;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public boolean isPaid() {
        return isPaid;
    }
}
