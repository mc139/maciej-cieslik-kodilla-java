package com.kodilla.good.patterns.challenges.productOrder;

public class Application {

    public static void main(String[] args) {

        ShopUser user = new ShopUser("john", "Smith", 2000);

        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest = new PurchaseRequestRetriever().retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MessageService(),
                new LaptopOrderService(), new LaptopProductRepository());

        productOrderService.process(purchaseRequest);
    }
}
