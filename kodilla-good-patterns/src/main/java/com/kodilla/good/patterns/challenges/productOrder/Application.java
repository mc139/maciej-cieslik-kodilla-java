package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {

        ShopUser user = new ShopUser("john","Smith",2000);

        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest = new PurchaseRequestRetriever().retrieve();

//        ProductOrderService productOrderService = new ProductOrderService().process(user, LocalDateTime.now();

    }
}
