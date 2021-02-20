package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//        System.out.println("Decorated Strings");
//
//        String decoration1 = "//!!//!!";
//        String decoration2 = " . . . . .";
//        PoemBeautifier poemBeautifier1 = new PoemBeautifier();
//        String readyText1 = poemBeautifier1.beautify("My String",(stringToDecorate -> stringToDecorate.toUpperCase()));
//        String readyText2 = poemBeautifier1.beautify("My String",(stringToDecorate -> "ABC"+ stringToDecorate+ "ABC"));
//        String readyText3 = poemBeautifier1.beautify("My String",(stringToDecorate -> decoration1 + stringToDecorate + decoration1));
//        String readyText4 = poemBeautifier1.beautify("My String",(stringToDecorate ->decoration2 +stringToDecorate + decoration2 ));
//
//        System.out.println(readyText1);
//        System.out.println(readyText2);
//        System.out.println(readyText3);
//        System.out.println(readyText4);
//
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);
//        People.getList().stream()                         // [1]
//                .forEach(System.out::println);
//
//        BookDirectory theBookDirectory = new BookDirectory();
//
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));             // [1]
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());             // [2]
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())                   // [3]
//                .forEach(System.out::println);


//        Forum myForum = new Forum();
//        ArrayList<Forum> myForumList =

        LocalDate twentyYearsAgo = LocalDate.ofYearDay(2001, 40);
        Map<Integer, ForumUser> myFilteredForum = Forum.getUserList().stream()
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(twentyYearsAgo))
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getID, forumUser -> forumUser));

        myFilteredForum.entrySet().stream()
                .forEach(System.out::println);

    }
}
