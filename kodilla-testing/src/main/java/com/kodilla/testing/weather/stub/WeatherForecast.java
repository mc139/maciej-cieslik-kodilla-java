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

    public Double AverageTemperature(Temperatures temperatures) {

        Double sum = 0.0;

        for (Map.Entry<String, Double> averageTemperature :
                temperatures.getTemperatures().entrySet()) {

            sum = +sum + averageTemperature.getValue();

        }
        Double averageLong = sum / Double.valueOf(temperatures.getTemperatures().size());


        int temp = (int) (averageLong * 100.0);
        Double average = ((double) temp) / 100.0;
        return average;
    }

    public Double median(Temperatures temperatures) {
        // ONLY GOD KNOWS HOW IT WORKS !
        List<Double> hashMapToMedianList = new LinkedList<>();
        for (Map.Entry<String, Double> medianTemperature :
                temperatures.getTemperatures().entrySet()) {
            hashMapToMedianList.add(medianTemperature.getValue());
        }
        Collections.sort(hashMapToMedianList);
        int n = hashMapToMedianList.size() / 2;
        double median;
        if (hashMapToMedianList.size() % 2 == 0)
            median = (hashMapToMedianList.get(n) + hashMapToMedianList.get(n - 1)) / 2;
        else
            median = hashMapToMedianList.get(n);
        return median;
    }
}
