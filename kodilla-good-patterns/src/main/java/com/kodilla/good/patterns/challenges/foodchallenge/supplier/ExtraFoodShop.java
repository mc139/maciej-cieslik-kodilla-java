package com.kodilla.good.patterns.challenges.foodchallenge.supplier;

import com.kodilla.good.patterns.challenges.foodchallenge.orders.Order;
import com.kodilla.good.patterns.challenges.foodchallenge.orders.OrderDto;

import java.math.BigDecimal;

public class ExtraFoodShop extends FoodSupplier implements SupplierProcessor {
    final String SUPPLIER_NAME = "ExtraFoodShop";
    final String EMAIL = "ExtraFoodShop@mail.com";
    final BigDecimal PHONE_NUMBER = new BigDecimal("12312312334");

    public ExtraFoodShop(String supplierName, String email, BigDecimal phoneNumber) {
        super(supplierName, email, phoneNumber);
    }

    @Override
    public OrderDto process(Order order) {
        if (order.isPaid()) {
            System.out.println("Your order: " + order.getInvoiceNumber() + " has been successfully processed");
            return new OrderDto(order.getInvoiceNumber(), order.getFoodSupplier(), order.getProductList(), order.getDateTime(), order.isPaid());
        } else {
            System.out.println("Your order: " + order.getInvoiceNumber() + " is not paid yet and it's couldn't be processed," +
                    "please Contact :" + order.getFoodSupplier());
            return new OrderDto(order.getInvoiceNumber(), order.getFoodSupplier(), order.getProductList(), order.getDateTime(), order.isPaid());
        }
    }
}
