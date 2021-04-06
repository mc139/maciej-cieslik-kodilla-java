package com.kodilla.good.patterns.challenges.foodchallenge;

import com.kodilla.good.patterns.challenges.foodchallenge.orders.Order;
import com.kodilla.good.patterns.challenges.foodchallenge.orders.OrderCreator;
import com.kodilla.good.patterns.challenges.foodchallenge.supplier.Distributor;

public class Application {

    public static void main(String[] args) {

        OrderCreator oc = new OrderCreator();
        Order orderEFS = oc.sampleOrderExtraFoodShop();
        Order orderHS = oc.sampleOrderHealthyShop();
        Order orderGF = oc.sampleOrderGlutenFreeShop();

        Order order1 = new Order(orderEFS.getInvoiceNumber(), orderEFS.getFoodSupplier(),
                orderEFS.getProductList(),orderEFS.getDateTime(),orderEFS.isPaid(),"ExtraFoodShop");

        Order order2 = new Order(orderHS.getInvoiceNumber(), orderHS.getFoodSupplier(),
                orderHS.getProductList(),orderHS.getDateTime(),orderHS.isPaid(),"ExtraFoodShop");

        Order order3 = new Order(orderGF.getInvoiceNumber(), orderGF.getFoodSupplier(),
                orderGF.getProductList(),orderGF.getDateTime(),orderGF.isPaid(),"ExtraFoodShop");

        Distributor distributor = new Distributor();
        distributor.createOrder(order1);
        distributor.createOrder(order2);
        distributor.createOrder(order3);

    }
}
