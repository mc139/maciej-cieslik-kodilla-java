package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class WorldTestSuite {



    @Test
    void testGetPeopleQuantity(){
        //GIVEN
        World world = new World();

        Country nigeria = new Country("nigeria",new BigDecimal(23234231));
        Country egypt = new Country("egypt",new BigDecimal(23234231));
        Country ethiopia = new Country("ethiopia",new BigDecimal(23234231));
        Country usa = new Country("poland",new BigDecimal(23234231));
        Country mexico = new Country("poland",new BigDecimal(23234231));
        Country germany = new Country("poland",new BigDecimal(23234231));
        Country poland = new Country("poland",new BigDecimal(23234231));

        Continent americas = new Continent("americas", new ArrayList());
        Continent africa = new Continent("africa", new ArrayList());
        Continent europe = new Continent("europe", new ArrayList());

        africa.addCountry(nigeria);
        africa.addCountry(ethiopia);
        africa.addCountry(egypt);

        europe.addCountry(poland);
        europe.addCountry(germany);

        americas.addCountry(usa);
        americas.addCountry(mexico);

        world.addContinent(africa);
        world.addContinent(europe);
        world.addContinent(americas);

        //WHEN
        BigDecimal actual = world.getPeopleQuantity();
        BigDecimal expected = new BigDecimal("162639617");

        //THEN
        Assertions.assertEquals(expected,actual);

    }
}
