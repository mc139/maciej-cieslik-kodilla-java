package com.kodilla.good.patterns.challenges.flights.airports;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightFinder {

    List<Flight> flights;

    public FlightFinder(List<Flight> flights) {
        this.flights = flights;
    }

    public void addFlight(String airportFrom, String airportTo) {
        flights.add(new Flight(airportFrom, airportTo));
    }

    public List<Flight> findFlightFrom(String airportFrom) {
        List<Flight> airportListFrom = flights.stream()
                .filter(f -> f.getAirportFrom().contains(airportFrom))
                .collect(Collectors.toList());
        return airportListFrom;

    }

    public List<Flight> findFlightTo(String airportTo) {
        List<Flight> airportListTo = flights.stream()
                .filter(f -> f.getAirportTo().contains(airportTo))
                .collect(Collectors.toList());
        return airportListTo;
    }

    public List<Flight> findFlightThrough(String airportThrough) {

        List<Flight> airportListTo = flights.stream()
                .filter(f -> f.getAirportTo().contains(airportThrough))
                .collect(Collectors.toList());

        List<Flight> airportListFrom = flights.stream()
                .filter(f -> f.getAirportFrom().contains(airportThrough))
                .collect(Collectors.toList());

        List<Flight> airportsListThrough = Stream.of(airportListTo, airportListFrom)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        return airportsListThrough;
    }

    @Override
    public String toString() {
        return "FlightFinder{" +
                "flights=" + flights +
                '}';
    }
}
