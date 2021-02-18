package com.kodilla.stream;

import com.kodilla.stream.beatifier.PoemBeautifier;
import com.kodilla.stream.beatifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Decorated Strings");

        String decoration1 = "//!!//!!";
        String decoration2 = " . . . . .";
        PoemBeautifier poemBeautifier1 = new PoemBeautifier();
        String readyText1 = poemBeautifier1.beautify("My String",(stringToDecorate -> stringToDecorate.toUpperCase()));
        String readyText2 = poemBeautifier1.beautify("My String",(stringToDecorate -> "ABC"+ stringToDecorate+ "ABC"));
        String readyText3 = poemBeautifier1.beautify("My String",(stringToDecorate -> decoration1 + stringToDecorate + decoration1));
        String readyText4 = poemBeautifier1.beautify("My String",(stringToDecorate ->decoration2 +stringToDecorate + decoration2 ));

        System.out.println(readyText1);
        System.out.println(readyText2);
        System.out.println(readyText3);
        System.out.println(readyText4);

    }
}
