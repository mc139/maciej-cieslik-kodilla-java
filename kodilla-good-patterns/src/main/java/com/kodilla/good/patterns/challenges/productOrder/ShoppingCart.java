package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDate;

public class ShoppingCart implements ShoppingCartProcessor {
    ShopUser shopUser;
    Product product;
    int quantity;
    double totalPrice = product.getPrice() * quantity;

    @Override
    public boolean CartProcessor(ShopUser shopUser, Product product, int quantity, LocalDate date) {
       return  shopUser.getWalletValue() > totalPrice ? true : false;
    }
}
