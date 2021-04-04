package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PurchaseRequest {
    private ShopUser user;
    private LocalDateTime date;
    private Product product;
    private int quantity;

    public PurchaseRequest(ShopUser user, LocalDateTime date, Product product, int quantity) {
        this.user = user;
        this.date = date;
        this.product = product;
        this.quantity = quantity;
    }

    public PurchaseRequest retrieve(){
        ShopUser user = new ShopUser("John", "Smith",2000);
        LocalDateTime date = LocalDateTime.of(2021,4,3,12,5);
        return  new PurchaseRequest(user,date,product,quantity);
    }

    public Product getProduct() {
        return product;
    }

    public ShopUser getUser() {
        return user;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getQuantity() {
        return quantity;
    }
}
