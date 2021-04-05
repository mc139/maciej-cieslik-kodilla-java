package com.kodilla.good.patterns.challenges.foodchallenge;

import com.kodilla.good.patterns.challenges.foodchallenge.supplier.Distributor;

public class Application {

    public static void main(String[] args) {

        Distributor distributor1 = new Distributor("ExtraFoodShop");
        Distributor distributor2 = new Distributor("GlutenFreeShop");
        Distributor distributor3 = new Distributor("HealthyShop");
        distributor1.createOrder();
        distributor2.createOrder();
        distributor3.createOrder();
    }
}
