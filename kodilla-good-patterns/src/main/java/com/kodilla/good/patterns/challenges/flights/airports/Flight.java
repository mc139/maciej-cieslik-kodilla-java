package com.kodilla.good.patterns.challenges.flights.airports;

public class Flight {

    private String airportFrom;
    private String airportTo;

    public Flight(String airportFrom, String airportTo) {
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
    }

    public String getAirportFrom() {
        return airportFrom;
    }

    public void setAirportFrom(String airportFrom) {
        this.airportFrom = airportFrom;
    }

    public String getAirportTo() {
        return airportTo;
    }

    public void setAirportTo(String airportTo) {
        this.airportTo = airportTo;
    }

    @Override
    public String toString() {
        return "Flight from " +
                  airportFrom +
                " To :" + airportTo ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (airportFrom != null ? !airportFrom.equals(flight.airportFrom) : flight.airportFrom != null) return false;
        return airportTo != null ? airportTo.equals(flight.airportTo) : flight.airportTo == null;
    }

    @Override
    public int hashCode() {
        int result = airportFrom != null ? airportFrom.hashCode() : 0;
        result = 31 * result + (airportTo != null ? airportTo.hashCode() : 0);
        return result;
    }
}
