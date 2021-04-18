package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BigMacTestSuite {

    @Test
    void testBigMacBuild() {
        //GIVEN
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun(Bun.SESAME)
                .sauce(Sauce.BBQ)
                .numberOfPatties(6)
                .addIngredients(IngredientsType.BACON)
                .addIngredients(IngredientsType.BACON)
                .addIngredients(IngredientsType.CHILLI)
                .addIngredients(IngredientsType.CHEESE)
                .addIngredients(IngredientsType.LETTUCE)
                .addIngredients(IngredientsType.CUCUMBER)
                .build();

        System.out.println(bigMac);

        //WHEN
        int numberOfPatties = bigMac.getNumberOfPatties();
        int numberOfExtras = bigMac.getIngredients().size();
        Sauce sauce = bigMac.getSauce();

        //THEN
        assertEquals(6, numberOfPatties);
        assertEquals(6, numberOfExtras);
        assertNotEquals(Sauce.THOUSAND_ISLANDS, sauce);

    }
}
