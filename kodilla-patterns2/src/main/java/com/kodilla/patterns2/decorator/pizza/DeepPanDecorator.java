package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class DeepPanDecorator extends AbstractPizzaOrderDecorator{
    public DeepPanDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal(6));
    }
    @Override
    public String getToppings() {
        return super.getToppings() + ", Deep Pan";
    }
}
