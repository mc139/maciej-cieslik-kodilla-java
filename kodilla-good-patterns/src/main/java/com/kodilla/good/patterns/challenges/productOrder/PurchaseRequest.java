package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PurchaseRequest {
    private ShopUser user;
    private LocalDateTime date;

    public PurchaseRequest(final ShopUser user, final LocalDateTime date) {
        this.user = user;
        this.date = date;
    }

    public PurchaseRequest retrieve(){
        ShopUser user = new ShopUser("John", "Smith",2000);
        LocalDateTime date = LocalDateTime.of(2021,4,3,12,5);
        return  new PurchaseRequest(user,date);
    }

    public ShopUser getUser() {
        return user;
    }

    public LocalDateTime getDate() {
        return date;
    }

}
