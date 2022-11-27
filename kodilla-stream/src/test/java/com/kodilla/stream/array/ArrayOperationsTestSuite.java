package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    void getAverage(){

        int[] inputData = new int[20];

        for (int i=0; i<20; i++){
            inputData[i] = i;
        }

        OptionalDouble averageValue = ArrayOperationsClass.getAverage(inputData);

        Assertions.assertEquals(9.5, averageValue.getAsDouble());

    }
}
