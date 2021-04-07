package com.kodilla.spring.calculator;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void TestCalculations() {

        //GIVEN

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator c = context.getBean(Calculator.class);

        //WHEN

        double addVal = c.add(1,1);
        double subVal = c.sub(4,1);
        double mulVal = c.mul(2,2);
        double divVal = c.div(10,2);

        //THEN

        Assertions.assertEquals(2,addVal);
        Assertions.assertEquals(3,subVal);
        Assertions.assertEquals(4,mulVal);
        Assertions.assertEquals(5,divVal);

    }
}
