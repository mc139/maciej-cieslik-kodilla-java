package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDateTime;

public class LaptopProductRepository implements ProductRepository {

    @Override
    public void createPurchase(ShopUser user, LocalDateTime date, Product product, int quantity) {
        System.out.println(user.toString() + "made purchase: " + date + " of product: " + product + "x" + quantity);
    }
}
