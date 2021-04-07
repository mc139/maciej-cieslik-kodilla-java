package com.kodilla.good.patterns.challenges.flights.airports;

import java.util.List;

public class AirportConnectionCreator {

    private Airport airport;
    private List<Airport> departureAirports;

    public AirportConnectionCreator(Airport airport) {
        this.airport = airport;
    }

   public void createConnections(Airport airport){
        Airport gda = new Airport("GDANSK", "GDA");
        Airport lon = new Airport("LONDON","LHR");
        Airport ber = new Airport("BERLIN","BER");
        Airport lax = new Airport("LOS ANGELES","LAX");
        Airport mos = new Airport("MOSCOW","MOS");
        Airport man = new Airport("MANCHESTER","MAN");


        if(airport.getCodeAITA().contains("KRK")){
            departureAirports.add(gda);
            departureAirports.add(lon);
            departureAirports.add(ber);
            departureAirports.add(mos);
        } if ((airport.getCodeAITA().contains("LHR"))){
            departureAirports.add(mos);
            departureAirports.add(lax);
            departureAirports.add(man);
        }

        airport.setAvailableAirports(departureAirports);

    }
}
