package com.kodilla.good.patterns.challenges.flights;

import com.kodilla.good.patterns.challenges.flights.airports.Airport;
import com.kodilla.good.patterns.challenges.flights.airports.AirportConnectionCreator;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        Airport krk = new Airport("KRAKOW","KRK");
        AirportConnectionCreator cc = new AirportConnectionCreator(krk);
        cc.createConnections(krk);
        krk.getAvailableAirports();




    }
}
