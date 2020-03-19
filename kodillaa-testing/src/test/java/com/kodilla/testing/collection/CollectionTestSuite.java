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

        if(numbers == null){
            System.out.println("Brak zawartości");
        }
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0, 1);
        numbers.add(1,2);
        numbers.add(2,3);
        numbers.add(3,4);
        numbers.add(4,5);

        System.out.println(OddNumbersExterminator.exterminate());
    }


}
