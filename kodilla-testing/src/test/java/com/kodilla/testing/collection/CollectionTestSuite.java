package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
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
        List<Integer> expected = new ArrayList<>();
        OddNumbersExterminator underTest = new OddNumbersExterminator();

        //WHEN
        List<Integer> result = underTest.exterminate(numbers);

        //THEN
        Assertions.assertEquals(expected, result);
    }

    @DisplayName("When created List with numbers range 0-100 checking is the Class return correct values")
    @Test
    void testOddNumbersExterminatorNormalList() {

        //GIVEN
        List<Integer> numbers = List.of(1, 2, 35, 6, 4, 3, 2, 32, 12, 5, 6);
        List<Integer> expected = List.of(2, 6, 4, 2, 32, 12, 6);
        OddNumbersExterminator underTest = new OddNumbersExterminator();

        //WHEN
        List<Integer> result = underTest.exterminate(numbers);

        //THEN
        Assertions.assertEquals(expected, result);
    }
}
