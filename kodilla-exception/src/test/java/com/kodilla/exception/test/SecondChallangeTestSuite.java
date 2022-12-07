package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallangeTestSuite {

    @Test
    void testOne(){

        ExceptionHandling exceptionHandling = new ExceptionHandling();

        //3 boundary conditions:
        //  x>=2
        //  x<1
        //  y=1.5

        assertAll(
                () -> assertThrows(MyOwnException.class, () -> exceptionHandling.sth(2,10)),
                () -> assertThrows(MyOwnException.class, () -> exceptionHandling.sth(0, 10)),
                () -> assertThrows(MyOwnException.class, () -> exceptionHandling.sth(0, 1.5))
        );

    }


}
