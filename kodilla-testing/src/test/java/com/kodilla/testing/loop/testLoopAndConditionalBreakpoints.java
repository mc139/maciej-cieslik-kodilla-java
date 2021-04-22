package com.kodilla.testing.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testLoopAndConditionalBreakpoints {

    @Test
    void testLoop(){

        //GIVEN
        long sum = 0;
        //WHEN
        for (int n =0; n <1000; n++ ){
        sum += n;
            System.out.println(n + " sum : " + sum);

        }
        //THEN
        assertEquals(499500, sum);

    }
}
