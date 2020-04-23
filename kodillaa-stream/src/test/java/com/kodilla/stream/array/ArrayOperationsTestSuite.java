package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        int num [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        double expectedAverage = 10.5;

        double average = ArrayOperations.getAverage(num);

        Assert.assertEquals(expectedAverage, average, 0.0001);
    }
}
