package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface ShoppingCartProcessor {

    boolean CartProcessor(ShopUser shopUser, Product product, int quantity, LocalDate date);
}
