package com.kodilla.testing;


import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Calculator test");
        System.out.println("-------------------------------");

        Calculator calculator = new Calculator(2, 6);
        int addResult = calculator.add(2, 6);
        int subtractResult = calculator.subtract(2, 6);

        if (addResult == 8) {
            System.out.println("Test for add method OK!");
        } else {
            System.out.println("Error in add method!");
        }

        if (subtractResult == -4) {
            System.out.println("Test for subtract method OK!");
        } else {
            System.out.println("Error in subtract method!");
        }


    }


}

