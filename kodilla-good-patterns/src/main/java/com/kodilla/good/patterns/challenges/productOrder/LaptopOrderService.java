package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDateTime;

public class LaptopOrderService implements ProductProcessor {

    @Override
    public boolean buy(ShopUser shopUser, LocalDateTime date, Product product, int quantity) {
        return true;
    }
}
