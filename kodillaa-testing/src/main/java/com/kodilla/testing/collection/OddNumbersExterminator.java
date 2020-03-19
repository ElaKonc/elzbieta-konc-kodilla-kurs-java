package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public static List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> equalsNumbers = new ArrayList<Integer>();

        for(Integer n : numbers) {
            if(n % 2 == 0){
                equalsNumbers.add(n);
            }
        }

        return equalsNumbers;
    }

}
