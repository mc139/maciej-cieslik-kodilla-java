package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("When created List is Empty checking if Class works correctly")
    @Test
    void testOddNumberExterminatorEmptyList() {


        //GIVEN
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator test1 = new OddNumbersExterminator(numbers);


        //WHEN

        for (Integer testInteger : test1.numbers){
            if(testInteger == null){
                System.out.println("List is Empty!");
            }
        }


            //THEN
            Assertions.assertTrue(test1.exterminate(numbers).isEmpty());

    }

    @DisplayName("When created List with numbers range 0-100 checking is the Class return correct values")
    @Test
    void  testOddNumbersExterminatorNormalList(){

        //GIVEN
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator test2 = new OddNumbersExterminator(numbers);

        for (int i=0; i <100; i++){
            test2.numbers.add(i);
        }
        for (Integer i=0; i <100; i++){
            test2.exterminate(numbers);
        }

        //WHEN
        Integer firstExpectedNumber = 2;
        Integer secondExpectedNumber = 4;
        Integer thirdExpectedNumber = 8;

        Integer firstNumberResult = test2.numbers.get(0);
        Integer secondNumberResult = test2.numbers.get(1);
        Integer thirdNumberResult = test2.numbers.get(3);

        //THEN
        Assertions.assertEquals(firstExpectedNumber,firstNumberResult);
        Assertions.assertEquals(secondExpectedNumber,secondNumberResult);
        Assertions.assertEquals(thirdExpectedNumber,thirdNumberResult);

    }
}
