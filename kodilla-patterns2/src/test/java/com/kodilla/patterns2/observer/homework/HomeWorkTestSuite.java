package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWorkTestSuite {

    @Test
    void testUpdate() {
        //GIVEN
        HomeWork designPatterns = new DesignPatternsHomeWork();
        HomeWork stream = new JavaStreamHomeWork();
        HomeWork streamMoreAdvanced = new JavaStreamHomeWork();
        Mentor mentor1 = new Mentor("John Smith");
        Mentor mentor2 = new Mentor("Lidia Standford");
        stream.registerObserver(mentor1);
        stream.registerObserver(mentor2);
        designPatterns.registerObserver(mentor1);
        designPatterns.registerObserver(mentor2);
        streamMoreAdvanced.registerObserver(mentor1);

        //WHEN
        stream.addTask("First task with Java stream");
        stream.addTask("Second task with Java stream");
        stream.addTask("Third task with Java stream");
        stream.addTask("Fourth task with Java stream");
        designPatterns.addTask("First task with Design Patterns");
        designPatterns.addTask("Second task with Design Patterns");
        designPatterns.addTask("Third task with Design Patterns");
        streamMoreAdvanced.addTask("First task with more advanced Java stream");
        streamMoreAdvanced.addTask("Second task with more advanced Java stream");
        streamMoreAdvanced.addTask("Third task with more advanced Java stream");

        //THEN
        Assertions.assertEquals(7, mentor2.getTaskCount());
        Assertions.assertEquals(10, mentor1.getTaskCount());

    }
}
