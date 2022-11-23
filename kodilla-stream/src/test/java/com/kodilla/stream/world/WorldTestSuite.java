package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){

        Country polska = new Country(new BigDecimal("123123123123"), "Polska");
        Country niemcy = new Country(new BigDecimal("234234234234"), "Niemcy");
        Country slowacja = new Country(new BigDecimal("9879879876"), "Slowacja");
        Country czechy = new Country(new BigDecimal("6546546546"), "Czechy");
        Country austria = new Country(new BigDecimal("7777777777777"), "Austria");

        List<Country> listOfEuropeInput = new ArrayList<>();
        listOfEuropeInput.add(polska);
        listOfEuropeInput.add(niemcy);

        List<Country> listOfAsiaInput = new ArrayList<>();
        listOfAsiaInput.add(slowacja);
        listOfAsiaInput.add(czechy);

        List<Country> listOfAmericaInput = new ArrayList<>();
        listOfAmericaInput.add(austria);

        Continent europa = new Continent(listOfEuropeInput, "EUROPA");
        Continent asia = new Continent(listOfAsiaInput, "ASIA");
        Continent america = new Continent(listOfAmericaInput, "AMERICA");

        List<Continent> earthList = new ArrayList<>();
        earthList.add(europa);
        earthList.add(asia);
        earthList.add(america);

        World earth = new World(earthList, "! EARTH! ");

        BigDecimal quantityFromMethod = earth.getPeopleQuantity();

        BigDecimal A = new BigDecimal("123123123123");
        BigDecimal B = new BigDecimal("234234234234");
        BigDecimal C = new BigDecimal("9879879876");
        BigDecimal D = new BigDecimal("6546546546");
        BigDecimal E = new BigDecimal("7777777777777");



        BigDecimal quantityCorrectAnswer = BigDecimal.ZERO.add(A).add(B).add(C).add(D).add(E);

        Assertions.assertEquals(quantityFromMethod, quantityCorrectAnswer);



    }
}
