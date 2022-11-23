package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    List<Continent> listOfContinents = new ArrayList<>();
    String name;

    public World(List<Continent> listOfContinents, String name) {
        this.listOfContinents = listOfContinents;
        this.name = name;
    }

    BigDecimal getPeopleQuantity(){
        BigDecimal totalValue = listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return totalValue;


    }


}
