package com.kodilla.good.patterns.challenges.foodchallenge.supplier;

import com.kodilla.good.patterns.challenges.foodchallenge.orders.Order;
import com.kodilla.good.patterns.challenges.foodchallenge.orders.OrderCreator;

import java.math.BigDecimal;

public class Distributor {

    private String nameOfSupplier;

    public Distributor(String nameOfSupplier) {
        this.nameOfSupplier = nameOfSupplier;
    }

    public void createOrder(){
        if (nameOfSupplier == "ExtraFoodShop"){
            ExtraFoodShop extraFoodShop = new ExtraFoodShop("extra food shop","email",new BigDecimal("213123123"));
            OrderCreator orderCreator = new OrderCreator();
            Order order = orderCreator.sampleOrderExtraFoodShop();
            extraFoodShop.process(order);
        } if (nameOfSupplier == "GlutenFreeShop"){
            GlutenFreeShop glutenFreeShop = new GlutenFreeShop("GlutenFreeShop","email", new BigDecimal("213213423444"));
            OrderCreator orderCreator = new OrderCreator();
            Order order = orderCreator.sampleOrderGlutenFreeShop();
            glutenFreeShop.process(order);
        } if (nameOfSupplier == "HealthyShop"){
            HealthyShop healthyShop = new HealthyShop("HealthyShop","email",new BigDecimal("6632131245"));
            OrderCreator orderCreator = new OrderCreator();
            Order order = orderCreator.sampleOrderHealthyShop();
            healthyShop.process(order);
        }
    }
}
