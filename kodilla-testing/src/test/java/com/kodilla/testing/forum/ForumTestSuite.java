package com.kodilla.testing.forum;

import org.junit.jupiter.api.*;
import com.kodilla.testing.user.SimpleUser;

@DisplayName("ForumUser test")
public class ForumTestSuite {

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

    @DisplayName("When created SimpleUser with name. " +
    "then getUsername should return correct name")

    @Test
    void testCaseRealName(){

        //GIVEN
        SimpleUser user1 = new SimpleUser("user1","John Smith");

        //WHEN
        String result = user1.getRealName();

        System.out.println("Testing " + result);
        //THEN
        Assertions.assertEquals(result,"John Smith");

    }


    @Test
    void testCaseUsername() {

        //GIVEN
        SimpleUser user1 = new SimpleUser("user1","John Smith");

        //WHEN
        String result = user1.getUsername();

        String expectedResult = "user1";

        // THEN
        Assertions.assertEquals(expectedResult , result);

    }


}
