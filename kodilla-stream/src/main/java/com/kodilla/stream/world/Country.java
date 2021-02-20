package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public BigDecimal getPeopleQtyInTheCountry() {
        return peopleQtyInTheCountry;
    }

    public Country(String nameOfCountry, BigDecimal peopleQtyInTheCountry) {
        this.nameOfCountry = nameOfCountry;
        this.peopleQtyInTheCountry = peopleQtyInTheCountry;
    }

    private String nameOfCountry;
    private final BigDecimal peopleQtyInTheCountry;

    public BigDecimal getPeopleQuantity(){
        return peopleQtyInTheCountry;
    }
}
