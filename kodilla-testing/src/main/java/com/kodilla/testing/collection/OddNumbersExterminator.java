package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers){


        List<Integer> listOfEven = new ArrayList<>();

        for (Integer temporary: numbers){
            if (temporary % 2 == 0){
                listOfEven.add(temporary);
            }
        }

        return listOfEven;
    }
}
