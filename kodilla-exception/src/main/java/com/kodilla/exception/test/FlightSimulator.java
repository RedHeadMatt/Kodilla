package com.kodilla.exception.test;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class FlightSimulator {

    public String findFlight(@NotNull Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> hashMapOfAirports = new HashMap<>();

        hashMapOfAirports.put("AAAA", true);
        hashMapOfAirports.put("BBBB", true);
        hashMapOfAirports.put("CCCC", true);
        hashMapOfAirports.put("DDDD", true);

        if (hashMapOfAirports.containsKey(flight.getArrivalAirport())){
            System.out.println("FLIGHT SIMULATOR ZNALAZL W MAPIE");
            return flight.getArrivalAirport();
        }
        else{
            throw new RouteNotFoundException();
        }
    }

}
