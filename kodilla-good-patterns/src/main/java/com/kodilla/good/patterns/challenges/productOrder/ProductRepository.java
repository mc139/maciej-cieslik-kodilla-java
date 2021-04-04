package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDateTime;

public interface ProductRepository {

    void createPurchase(ShopUser user, LocalDateTime date,Product product,int quantity);

}
