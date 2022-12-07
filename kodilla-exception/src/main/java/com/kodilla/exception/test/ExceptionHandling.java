package com.kodilla.exception.test;

public class ExceptionHandling {



    public void sth(double x, double y) throws MyOwnException {

        SecondChallenge challenge = new SecondChallenge();

        try{
            challenge.probablyIWillThrowException(x, y);

        } catch (Exception e) {
            throw new MyOwnException();
        }
        finally {
            System.out.println("STH");
        }
        }


    }
