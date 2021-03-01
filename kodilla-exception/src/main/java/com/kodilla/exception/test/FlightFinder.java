package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public Map<String, Boolean> availableAirports() {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("KRK", true);
        airports.put("LON", true);
        airports.put("IBZ", false);
        airports.put("DUB", false);
        airports.put("MAN", true);
        airports.put("BER", false);
        airports.put("JFK", true);

        return airports;
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        if (availableAirports().containsKey(flight.getArrivalAirport())) {
            return availableAirports().get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("NO SUCH AIRPORT FIND");
        }
    }

    public static void main(String[] args) {
        Flight londonToJFK = new Flight("LON", "JFK");
        Flight ibizaToBerlin = new Flight("IBZ", "BER");
        Flight manchesterToDublin = new Flight("MAN", "DUB");
        Flight cracowToLondon = new Flight("KRK", "LON");
        Flight ibizaToManchester = new Flight("IBZ", "MAN");
        Flight jFKtoDoncaster = new Flight("JFK", "DSA");

        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(londonToJFK);
            System.out.println("Flight available!");
            System.out.println(londonToJFK);
        } catch (RouteNotFoundException e) {
            System.out.println("FLIGHT NOT FOUND"+ " " + londonToJFK);
        } finally {
            System.out.println("FLIGHT CHECKED!");
        }

        try {
            flightFinder.findFlight(ibizaToBerlin);
            System.out.println("Flight available!");
            System.out.println(ibizaToBerlin);
        } catch (RouteNotFoundException e) {
            System.out.println("FLIGHT NOT FOUND"+ " " + ibizaToBerlin);
        } finally {
            System.out.println("FLIGHT CHECKED!");
        }

        try {
            flightFinder.findFlight(manchesterToDublin);
            System.out.println("Flight available!");
            System.out.println(manchesterToDublin);
        } catch (RouteNotFoundException e) {
            System.out.println("FLIGHT NOT FOUND"+ " " + manchesterToDublin);
        } finally {
            System.out.println("FLIGHT CHECKED!");
        }

        try {
            flightFinder.findFlight(cracowToLondon);
            System.out.println("Flight available!");
            System.out.println(cracowToLondon);
        } catch (RouteNotFoundException e) {
            System.out.println("FLIGHT NOT FOUND"+ " " + cracowToLondon);
        } finally {
            System.out.println("FLIGHT CHECKED!");
        }

        try {
            flightFinder.findFlight(ibizaToManchester);
            System.out.println("Flight available!");
            System.out.println(ibizaToManchester);
        } catch (RouteNotFoundException e) {
            System.out.println("FLIGHT NOT FOUND"+ " " + ibizaToManchester);
        } finally {
            System.out.println("FLIGHT CHECKED!");
        }

        try {
            flightFinder.findFlight(jFKtoDoncaster);
            System.out.println("Flight available!");
            System.out.println(jFKtoDoncaster);
        } catch (RouteNotFoundException e) {
            System.out.println("FLIGHT NOT FOUND" + " " + jFKtoDoncaster);
        } finally {
            System.out.println("FLIGHT CHECKED!");
        }

    }
}
