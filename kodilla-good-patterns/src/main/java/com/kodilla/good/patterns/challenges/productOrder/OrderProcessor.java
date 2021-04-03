package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDate;

public class OrderProcessor implements ShoppingCartProcessor {

    ShopUser user;
    Product product;
    int quantity;
    LocalDate date;
    boolean isAbleToProcess;

    public OrderProcessor(ShopUser user, Product product, int quantity, LocalDate date, boolean isAbleToProcess) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.date = date;
        this.isAbleToProcess = isAbleToProcess;
    }


    @Override
    public boolean CartProcessor(ShopUser shopUser, Product product, int quantity, LocalDate date) {
        return true;
    }
}
