package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //GIVEN
        int[] theNumbers = new int[20];
        theNumbers[0] = 1;
        theNumbers[1] = 2;
        theNumbers[2] = 3;
        theNumbers[3] = 4;
        theNumbers[4] = 5;
        theNumbers[5] = 6;
        theNumbers[6] = 7;
        theNumbers[7] = 8;
        theNumbers[8] = 9;
        theNumbers[9] = 10;
        theNumbers[10] = 11;
        theNumbers[11] = 12;
        theNumbers[12] = 13;
        theNumbers[13] = 14;
        theNumbers[14] = 15;
        theNumbers[15] = 16;
        theNumbers[16] = 17;
        theNumbers[17] = 18;
        theNumbers[18] = 19;
        theNumbers[19] = 20;
        //WHEN
        double averageResult = ArrayOperations.getAverage(theNumbers);
        //THEN
        Assert.assertEquals(10.5, averageResult, 0.1);

    }
}
