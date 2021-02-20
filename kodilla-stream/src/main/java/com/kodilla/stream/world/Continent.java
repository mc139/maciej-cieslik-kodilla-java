package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> countriesOnCertainContinent = new ArrayList<>();
    private final String continentName;

    public Continent(String continentName, List countriesOnCertainContinent) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        countriesOnCertainContinent.add(country);
    }

    public List<Country> getCountriesOnCertainContinent() {
        return new ArrayList<>(countriesOnCertainContinent);
    }

}
