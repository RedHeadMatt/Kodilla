package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    List<Country> listOfCountries = new ArrayList<>();
    String name;

    public Continent(List<Country> listOfCountries, String name) {
        this.listOfCountries = listOfCountries;
        this.name = name;
    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }
}
