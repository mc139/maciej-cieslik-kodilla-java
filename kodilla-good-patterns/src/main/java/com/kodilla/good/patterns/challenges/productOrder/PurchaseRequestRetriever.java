package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDateTime;

public class PurchaseRequestRetriever {
    public PurchaseRequest retrieve() {
        ShopUser shopUser = new ShopUser("John", "Wekl",2000);

        LocalDateTime purchaseDate = LocalDateTime.of(2020, 4, 3, 12, 5);

        return new PurchaseRequest(shopUser,purchaseDate);
    }
}
