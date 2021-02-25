package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String testResult = null;
        try {
            testResult = secondChallenge.probablyIWillThrowException(5, 4);
        } catch (Exception e ){
            System.out.println("Exception happend! : " + e );
        } finally {
            System.out.println(testResult);
        }
    }
}
