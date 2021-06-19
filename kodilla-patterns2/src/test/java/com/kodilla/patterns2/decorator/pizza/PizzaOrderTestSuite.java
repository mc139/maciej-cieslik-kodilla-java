package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    void testSimplePizzaGetPriceAndToppings(){
        // GIVEN
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        // WHEN
        BigDecimal price = pizzaOrder.getPrice();
        String toppings = pizzaOrder.getToppings();

        // THEN

        Assertions.assertEquals(new BigDecimal(15) , price);
        Assertions.assertEquals("Dough, Tomato sauce, Cheese", toppings);
    }

    @Test
    void testPineapplePizzaGetPriceAndToppings(){
        // GIVEN
        PizzaOrder pizzaOrderPineapple = new BasicPizzaOrder();
        pizzaOrderPineapple = new HamDecorator(pizzaOrderPineapple);
        pizzaOrderPineapple = new PinappleDecorator(pizzaOrderPineapple);

        // WHEN
        BigDecimal price = pizzaOrderPineapple.getPrice();
        String toppings = pizzaOrderPineapple.getToppings();

        // THEN

        Assertions.assertEquals(new BigDecimal(19) , price);
        Assertions.assertEquals("Dough, Tomato sauce, Cheese, Ham, Pineapple", toppings);
    }

    @Test
    void testPizzaWithManyToppingsGetPriceAndToppings(){
        // GIVEN
        PizzaOrder pizzaOrderManyToppings = new BasicPizzaOrder();
        pizzaOrderManyToppings = new PepperoniDecorator(pizzaOrderManyToppings);
        pizzaOrderManyToppings = new PepperoniDecorator(pizzaOrderManyToppings);
        pizzaOrderManyToppings = new PinappleDecorator(pizzaOrderManyToppings);
        pizzaOrderManyToppings = new PinappleDecorator(pizzaOrderManyToppings);
        pizzaOrderManyToppings = new HamDecorator(pizzaOrderManyToppings);
        pizzaOrderManyToppings = new StuffedCrustDecorator(pizzaOrderManyToppings);

        // WHEN
        BigDecimal price = pizzaOrderManyToppings.getPrice();
        String toppings = pizzaOrderManyToppings.getToppings();

        // THEN

        Assertions.assertEquals(new BigDecimal(29) , price);
        Assertions.assertEquals("Dough, Tomato sauce," +
                " Cheese, Pepperoni," +
                " Pepperoni, Pineapple, Pineapple," +
                " Ham, Stuffed Crust", toppings);
    }

}
