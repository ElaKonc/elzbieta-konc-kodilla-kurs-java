package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;

public class CollectionTestSuite {

    @Before
    public void startTest(){
        System.out.println("Start");
    }

    @After
    public void endTest(){
        System.out.println("Stop");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        List<Integer> result = OddNumbersExterminator.exterminate(numbers);

        Assert.assertTrue(result.isEmpty());

        System.out.println(result);

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> result = OddNumbersExterminator.exterminate(numbers);

        Assert.assertFalse(result.isEmpty());

        System.out.println(OddNumbersExterminator.exterminate(result));
    }
}
