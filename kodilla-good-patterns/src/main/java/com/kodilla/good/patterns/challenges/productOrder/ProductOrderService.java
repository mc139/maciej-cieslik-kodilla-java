
package com.kodilla.good.patterns.challenges.productOrder;

import java.time.LocalDateTime;

public class ProductOrderService  {

    private ShoppingCart informationService;
    private OrderProcessor orderProcessor;
    private ProductRepository productRepository;
    private PurchaseRequest purchaseRequest;

    public ProductOrderService(ShoppingCart informationService, OrderProcessor orderProcessor, ProductRepository productRepository) {
        this.informationService = informationService;
        this.orderProcessor = orderProcessor;
        this.productRepository = productRepository;
    }

    public PurchaseDto process(final ShopUser user, final LocalDateTime date) {
        boolean isAvailable = orderProcessor.buy(purchaseRequest.getUser(), purchaseRequest.getDate());
        if (isAvailable) {
            informationService.inform(user);
            productRepository.createPurchase(user,date);
            return new PurchaseDto(user, true);
        } else {
            return new PurchaseDto(user, false);
        }
    }

}
