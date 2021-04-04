package com.kodilla.good.patterns.challenges.productOrder;

public class MessageService implements InformationProcessor {

    @Override
    public void inform(ShopUser shopUser) {
        System.out.println(shopUser.toString() + "Your order is processed");
    }
}
