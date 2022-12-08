package com.kodilla;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightSimulator;
import com.kodilla.exception.test.RouteNotFoundException;

public class Main {
    public static void main(String[] args) {

        Flight flight1 = new Flight("AAAA", "BBBB");
        Flight flight2 = new Flight("CCCC", "DDDD");
        Flight flight3 = new Flight("Krakow", "Berlin");

        FlightSimulator flightSimulator = new FlightSimulator();

        try{
            String arrivalAirport = flightSimulator.findFlight(flight3);
            System.out.println("LOTNISKO: "+ arrivalAirport);
        }
        catch(RouteNotFoundException e){
            System.out.println("### Flight not found exception - system couldn't find arrival airport! ###");
        }

    }
}