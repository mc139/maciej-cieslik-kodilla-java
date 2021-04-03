package com.kodilla.good.patterns.challenges.productOrder;

public class Application {

    public static void main(String[] args) {


        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest = new PurchaseRequestRetriever().retrieve();

        BuyingProcessor buyingProcessor = new BuyingProcessor();

    }
}
