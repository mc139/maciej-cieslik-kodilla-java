package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){

        //GIVEN
        int[] array = {2,3,5,6,4,6,8,6,5,4,6,8,9,1,2,2,23,2,2,8};
        double expected = 5.6;
        //WHEN
        double actual =ArrayOperations.getAvarage(array);

        //THEN
        assertEquals(expected,actual);
    }

}
