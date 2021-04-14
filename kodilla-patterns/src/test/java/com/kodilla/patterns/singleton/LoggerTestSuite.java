package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void createNewLog() {
        logger = Logger.INSTANCE;
        logger.log("TEST LOG");
    }

    @AfterAll
    public static void getLastLog() {
        logger.getLastLog();
    }

    @Test
    void GetLastLogTest() {

        //GIVEN && WHEN
        String expected = "TEST LOG";
        //THEN
        Assertions.assertEquals(expected, logger.getLastLog());
    }

}
