package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    public final List<Continent> continentsInTheWorld = new ArrayList<>();

    public void addContinent(Continent continent) {
        continentsInTheWorld.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal totalPeople = continentsInTheWorld.stream()
                .flatMap(continent -> continent.getCountriesOnCertainContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, next) -> sum.add(next));
        return totalPeople;
    }
}
