package com.kodilla.good.patterns.challenges.flights;

import com.kodilla.good.patterns.challenges.flights.airports.FlightFinder;
import com.kodilla.good.patterns.challenges.flights.airports.ConnectionCreator;

public class Application {

    public static void main(String[] args) {

        ConnectionCreator acc = new ConnectionCreator();

        FlightFinder finder = new FlightFinder(acc.createFlightList());
        System.out.println(finder.findFlightFrom("GDA"));
        System.out.println(finder.findFlightTo("BER"));
        System.out.println(finder.findFlightThrough("MAN"));

    }
}
