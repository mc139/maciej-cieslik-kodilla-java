package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderProcessor {

    ShopUser user;
    Product product;
    int quantity;
    LocalDateTime date;
    boolean isAbleToProcess;

    public boolean buy(final ShopUser user, final LocalDateTime date) {
        System.out.println("Sending Order to : " + user.getName() + "Username: "+ user.getUserName()
                + " process date: " + date.toString());

        return true;
    }

    public OrderProcessor(ShopUser user, Product product, int quantity, LocalDateTime date, boolean isAbleToProcess) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.date = date;
        this.isAbleToProcess = isAbleToProcess;
    }
}
