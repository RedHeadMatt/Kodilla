package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperationsClass implements ArrayOperations{
    public static OptionalDouble getAverage(int[] numbers){

        OptionalDouble average = null;

        IntStream.range(0, numbers.length)
                .forEach(System.out::println);

        average = IntStream.range(0, numbers.length)
                .average();


        return average;
    }

}
