package com.kodilla.good.patterns.challenges.foodchallenge;

import com.kodilla.good.patterns.challenges.foodchallenge.orders.Order;
import com.kodilla.good.patterns.challenges.foodchallenge.orders.OrderCreator;
import com.kodilla.good.patterns.challenges.foodchallenge.productDataBase.Product;
import com.kodilla.good.patterns.challenges.foodchallenge.supplier.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.foodchallenge.supplier.FoodSupplier;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop("extra food shopp","email",new BigDecimal(213123123));
        OrderCreator orderCreator = new OrderCreator();
        Order order1 = orderCreator.sampleOrderExtraFoodShop();
        Order order2 = orderCreator.sampleOrderGlutenFreeShop();
        Order order3 = orderCreator.sampleOrderHealthyShop();

        extraFoodShop.process(order1);
        extraFoodShop.process(order2);
        extraFoodShop.process(order3);

    }
}
