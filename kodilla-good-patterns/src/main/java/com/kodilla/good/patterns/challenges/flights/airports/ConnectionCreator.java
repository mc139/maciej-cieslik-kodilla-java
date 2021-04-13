package com.kodilla.good.patterns.challenges.flights.airports;

import java.util.ArrayList;
import java.util.List;

public class ConnectionCreator {

    public List<Flight> createFlightList() {

        List<Flight> flightList = new ArrayList<>();

        flightList.add(new Flight("GDA","WWA"));
        flightList.add(new Flight("WWA","BER"));
        flightList.add(new Flight("BER","LAX"));
        flightList.add(new Flight("MOS","GDA"));
        flightList.add(new Flight("MAL","LAX"));
        flightList.add(new Flight("RZE","WRO"));
        flightList.add(new Flight("WWA","MAN"));
        flightList.add(new Flight("MAN","BER"));;

        return flightList;
    }
}
