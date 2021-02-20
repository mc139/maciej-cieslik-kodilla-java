package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {

    private final List<Country> countriesOnCertainContinent = new ArrayList<>();
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void addCountry(Country country) {
        countriesOnCertainContinent.add(country);
    }

    public List<Country> getCountriesOnCertainContinent() {
        return new ArrayList<>(countriesOnCertainContinent);
    }


}
