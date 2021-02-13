package com.kodilla.testing.weather.mock;                                     // [1]

import com.kodilla.testing.weather.stub.Temperatures;                         // [2]
import com.kodilla.testing.weather.stub.WeatherForecast;                      // [3]

import org.junit.jupiter.api.Assertions;                                      // [4]
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;                                            // [5]
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;                                       // [6]
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    Map<String, Double> temperaturesMap = new HashMap<>();

    @BeforeEach
    public final void addValues() {
        temperaturesMap.put("London", 25.5d);
        temperaturesMap.put("Glasgow", 26.2d);
        temperaturesMap.put("Bristol", 24.8d);
        temperaturesMap.put("Manchester", 25.2d);
        temperaturesMap.put("Liverpool", 26.1d);
    }

    @Mock
    private Temperatures temperaturesMock = null;

    @Test
    void testCalculateForecastWithMock() {

        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();     // [12]

        //Then
        Assertions.assertEquals(5, quantityOfSensors);

    }

    @Mock
    private Temperatures temperaturesMock1 = null;

    @Test
    void testAverageTemperatureWithMock() {

        // GIVEN
        when(temperaturesMock1.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast averageTemperatures = new WeatherForecast(temperaturesMock1);

        //WHEN
        Double actual = averageTemperatures.AverageTemperature(temperaturesMock1);
        Double expected = 25.56;

        //THEN
        Assertions.assertEquals(expected, actual);
    }

    @Mock
    private Temperatures temperaturesMock2 = null;

    @Test
    void testMedianTemperatureWithMock() {

        //GIVEN
        when(temperaturesMock2.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast medianTemperatures = new WeatherForecast(temperaturesMock2);

        //WHEN
        Double actual = medianTemperatures.median(temperaturesMock2);
        Double expected = 25.5;

        //THEN
        Assertions.assertEquals(expected, actual);

    }

}                                                                          // [14]
