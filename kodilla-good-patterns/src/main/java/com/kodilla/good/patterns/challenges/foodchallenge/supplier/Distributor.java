package com.kodilla.good.patterns.challenges.foodchallenge.supplier;

import com.kodilla.good.patterns.challenges.foodchallenge.orders.Order;

import java.math.BigDecimal;

public class Distributor {

    private Order order;

    public Distributor() {

    }

    public void createOrder(Order order){
        if (order.getFoodSupplier()instanceof ExtraFoodShop){
            ExtraFoodShop ex = new ExtraFoodShop("ExtraFoodShop","mail",new BigDecimal("231231231"));
            ex.process(order);
        } if (order.getFoodSupplier()instanceof GlutenFreeShop){
            GlutenFreeShop gf = new GlutenFreeShop("GlutenFreeShop","mail",new BigDecimal("123556678"));
            gf.process(order);
        } if (order.getFoodSupplier() instanceof HealthyShop){
            HealthyShop hs = new HealthyShop("HealthyShop","email",new BigDecimal("6632131245"));
            hs.process(order);
        }
    }
}
