package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDateTime;

public class PurchaseRequestRetriever {

    ShopUser shopUser = new ShopUser("John", "Smith123", 2000);
    LocalDateTime purchaseDate = LocalDateTime.of(2020, 4, 3, 12, 5);
    Product product = new Laptop("lenovo", "ultrabook", 1900);
    int quantity = 1;

    public PurchaseRequest retrieve() {
        return new PurchaseRequest(shopUser, purchaseDate, product, quantity);
    }
}
