package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public static List<Integer> exterminate() {

        List<Integer> euqalsNumbers = new ArrayList<Integer>();

        for(Integer n : euqalsNumbers) {
            if(n % 2 == 0){
                euqalsNumbers.add(n);
            }
        }

        return euqalsNumbers;
    }

}
