package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("CollectionTestSuite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("CollectionTestSuite: end");
    }

    @DisplayName("This test verify OddNumbersExterminator when input list is EMPTY")
    @Test
    void testOddNumbersExterminatorEmptyList(){

        List<Integer> inputList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        OddNumbersExterminator oddNumber = new OddNumbersExterminator();

        Assertions.assertEquals(result, oddNumber.exterminate(inputList));

    }

    @DisplayName("This test verify OddNumbersExterminator when input list is NORMAL")
    @Test
    void testOddNumbersExterminatorNormalList(){

        List<Integer> inputList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i=1; i<=10; i++){
            inputList.add(i);
            System.out.println(i);
        }

        result.add(2);
        result.add(4);
        result.add(6);
        result.add(8);
        result.add(10);

        OddNumbersExterminator oddNumber = new OddNumbersExterminator();

        Assertions.assertEquals(result, oddNumber.exterminate(inputList));
    }

    @DisplayName("This test verify OddNumbersExterminator when input ARRAY goes into LIST")
    @Test
    void testOddNumbersExterminatorArraysAsList(){

        Integer inputArray[] = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> inputList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        inputList = Arrays.asList(inputArray);

        result.add(2);
        result.add(4);
        result.add(6);
        result.add(8);
        result.add(10);

        OddNumbersExterminator oddNumber = new OddNumbersExterminator();

        Assertions.assertEquals(result, oddNumber.exterminate(inputList));
    }


}
