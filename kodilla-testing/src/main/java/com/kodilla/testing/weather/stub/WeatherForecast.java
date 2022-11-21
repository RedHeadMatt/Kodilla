package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double averageTemperature(){

        double sum=0;
        double averageTemperature=0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            sum += temperature.getValue();
        }

        averageTemperature = sum/temperatures.getTemperatures().size();

        return averageTemperature;
    }

    public double medianaTemperature(){

        Collection<Double> values = temperatures.getTemperatures().values();

        ArrayList<Double> listOfValues = new ArrayList<>(values);

        Collections.sort(listOfValues);

        if (listOfValues.size() % 2 == 0){
            double sum = listOfValues.get(listOfValues.size()/2) + listOfValues.get((listOfValues.size()/2)+1);
            return sum/2;
        }
        else{
            return listOfValues.get(listOfValues.size()/2);

        }

    }
}