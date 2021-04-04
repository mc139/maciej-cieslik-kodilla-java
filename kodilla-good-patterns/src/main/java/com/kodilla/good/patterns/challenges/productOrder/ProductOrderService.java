
package com.kodilla.good.patterns.challenges.productOrder;

public class ProductOrderService {

    private InformationProcessor informationProcessor;
    private ProductProcessor productProcessor;
    private ProductRepository productRepository;

    public ProductOrderService(InformationProcessor informationService, ProductProcessor productProcessor, ProductRepository productRepository) {
        this.informationProcessor = informationService;
        this.productProcessor = productProcessor;
        this.productRepository = productRepository;
    }

    public PurchaseDto process(PurchaseRequest purchaseRequest) {
        boolean isAvailable = productProcessor.buy(purchaseRequest.getUser(), purchaseRequest.getDate(),
                purchaseRequest.getProduct(), purchaseRequest.getQuantity());

        if (isAvailable) {
            informationProcessor.inform(purchaseRequest.getUser());
            productRepository.createPurchase(purchaseRequest.getUser(), purchaseRequest.getDate(), purchaseRequest.getProduct(), purchaseRequest.getQuantity());

        } else {
            System.out.println("Cannot Process That Order");
        }
        return new PurchaseDto(purchaseRequest.getUser(), isAvailable);
    }
}
