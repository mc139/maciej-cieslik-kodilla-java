package com.kodilla.good.patterns.challenges.flights.airports;

import java.util.List;

public class Airport {

    private String airportName;
    private String codeAITA;
    private List<Airport> availableAirports;


    public Airport(String airportName, String codeAITA) {
        this.airportName = airportName;
        this.codeAITA = codeAITA;
    }

    public String getAirportName() {
        return airportName;
    }

    public String getCodeAITA() {
        return codeAITA;
    }

    public List<Airport> getAvailableAirports() {
        return availableAirports;
    }

    public void setAvailableAirports(List<Airport> availableAirports) {
        this.availableAirports = availableAirports;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        if (airportName != null ? !airportName.equals(airport.airportName) : airport.airportName != null) return false;
        return codeAITA != null ? codeAITA.equals(airport.codeAITA) : airport.codeAITA == null;
    }

    @Override
    public int hashCode() {
        int result = airportName != null ? airportName.hashCode() : 0;
        result = 31 * result + (codeAITA != null ? codeAITA.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airportName='" + airportName + '\'' +
                ", indicatorCode='" + codeAITA + '\'' +
                '}';
    }
}
