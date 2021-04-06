package com.kodilla.good.patterns.challenges.foodchallenge.orders;

import com.kodilla.good.patterns.challenges.foodchallenge.productDataBase.Product;
import com.kodilla.good.patterns.challenges.foodchallenge.supplier.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.foodchallenge.supplier.FoodSupplier;
import com.kodilla.good.patterns.challenges.foodchallenge.supplier.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.foodchallenge.supplier.HealthyShop;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OrderCreator {

    Random random = new Random();

    public OrderCreator() {
    }

    public Order sampleOrderExtraFoodShop() {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop", "ExtraFoodShop@mail.com", new BigDecimal("1231231312"));
        List<Product> shoppingList = new ArrayList<>();
        shoppingList.add(new Product("bread", "white"));
        shoppingList.add(new Product("water", "bottled"));
        shoppingList.add(new Product("bread", "white"));
        shoppingList.add(new Product("bread", "white"));
        shoppingList.add(new Product("potatoes", "white"));
        shoppingList.add(new Product("bread", "white"));
        shoppingList.add(new Product("bread", "white"));
        shoppingList.add(new Product("bread", "white"));
        shoppingList.add(new Product("bread", "white"));

        Order order = new Order(1002, extraFoodShop, shoppingList, LocalDateTime.now(), random.nextBoolean(),"ExtraFoodShop");

        return order;
    }

    public Order sampleOrderGlutenFreeShop() {
        FoodSupplier glutenFreeShop = new GlutenFreeShop("GlutenFreeShop", "GlutenFreeShop@mail.com", new BigDecimal("654641312"));
        List<Product> shoppingList = new ArrayList<Product>();
        shoppingList.add(new Product("bread", "white"));
        shoppingList.add(new Product("water", "bottled"));
        shoppingList.add(new Product("bread", "white"));
        shoppingList.add(new Product("bread", "white"));
        shoppingList.add(new Product("potatoes", "white"));
        shoppingList.add(new Product("bread", "white"));
        shoppingList.add(new Product("bread", "white"));
        shoppingList.add(new Product("bread", "white"));
        shoppingList.add(new Product("bread", "white"));

        Order order = new Order(134202, glutenFreeShop, shoppingList, LocalDateTime.now(), random.nextBoolean(),"glutenFreeShop");

        return order;
    }

    public Order sampleOrderHealthyShop() {
        FoodSupplier HealthyShop = new HealthyShop("HealthyShop", "HealthyShop@mail.com", new BigDecimal("14431312"));
        List<Product> shoppingList = new ArrayList<Product>();
        shoppingList.add(new Product("bread", "white"));
        shoppingList.add(new Product("water", "bottled"));
        shoppingList.add(new Product("bread", "white"));
        shoppingList.add(new Product("bread", "white"));
        shoppingList.add(new Product("potatoes", "white"));
        shoppingList.add(new Product("bread", "white"));
        shoppingList.add(new Product("bread", "white"));
        shoppingList.add(new Product("bread", "white"));
        shoppingList.add(new Product("bread", "white"));

        Order order = new Order(104402, HealthyShop, shoppingList, LocalDateTime.now(), random.nextBoolean(),"HealthyShop");

        return order;
    }
}
