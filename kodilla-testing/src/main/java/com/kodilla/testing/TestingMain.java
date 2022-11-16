package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int addResult, substractResult;

        addResult = calculator.add(5, 10);
        substractResult = calculator.substract(5, 10);

        if (addResult == 15 && substractResult == -5){
            System.out.println("calculator test OK");
        } else {
            System.out.println("calculator test ERROR!");
        }



    }}