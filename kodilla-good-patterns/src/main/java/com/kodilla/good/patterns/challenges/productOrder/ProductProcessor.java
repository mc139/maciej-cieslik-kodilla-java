package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDateTime;

public interface ProductProcessor {
    boolean buy(ShopUser shopUser, LocalDateTime date,Product product,int quantity);
}
