package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallangeTestSuite {

    @Test
    void testOne(){

        SecondChallenge secondChallenge = new SecondChallenge();

        //3 boundary conditions:
        //  x>=2
        //  x<1
        //  y=1.5

        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(10, 20)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,10)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0, 10)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0, 1.5))
        );

    }


}
