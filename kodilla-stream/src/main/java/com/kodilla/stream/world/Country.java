package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    BigDecimal peopleQuantity;
    String countryName;

    public Country(BigDecimal peopleQuantity, String countryName) {
        this.peopleQuantity = peopleQuantity;
        this.countryName = countryName;
    }

    BigDecimal getPeopleQuantity(){

         return peopleQuantity;
     }
}
