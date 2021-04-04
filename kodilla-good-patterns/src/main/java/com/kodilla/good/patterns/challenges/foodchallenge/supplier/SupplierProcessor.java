package com.kodilla.good.patterns.challenges.foodchallenge.supplier;

import com.kodilla.good.patterns.challenges.foodchallenge.orders.Order;
import com.kodilla.good.patterns.challenges.foodchallenge.orders.OrderDto;

public interface SupplierProcessor {

    OrderDto process(Order order);
}
