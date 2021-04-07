package com.kodilla.good.patterns.challenges.flights.airports;

import java.util.List;

public class Krakow extends Airport {
    List<Airport> availableAirports;

    public Krakow(String airportName, String codeAITA) {
        super(airportName, codeAITA);
    }
}
