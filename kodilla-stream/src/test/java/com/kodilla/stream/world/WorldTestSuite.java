package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country poland = new Country(new BigDecimal("38000000"), "Poland");
        Country germany = new Country(new BigDecimal("82000000"), "Germany");
        Country italy = new Country(new BigDecimal("60000000"), "Italy");
        Country china = new Country(new BigDecimal("1379000000"), "China");
        Country india = new Country(new BigDecimal("1324000000"), "India");
        Country japan = new Country(new BigDecimal("127000000"), "Japan");
        Country unitedStates = new Country(new BigDecimal("327000000"), "United States");
        Country canada = new Country(new BigDecimal("36000000"), "Canada");
        Country mexico = new Country(new BigDecimal("122000000"), "Mexico");
        //When
        Continent europe = new Continent();
        europe.add(poland);
        europe.add(germany);
        europe.add(italy);
        Continent asia = new Continent();
        asia.add(china);
        asia.add(india);
        asia.add(japan);
        Continent america = new Continent();
        america.add(unitedStates);
        america.add(canada);
        america.add(mexico);
        World world = new World();
        world.add(europe);
        world.add(asia);
        world.add(america);
        world.getPeopleQuantity();
        //Then
        BigDecimal result = world.getPeopleQuantity();
        BigDecimal expectedPopulation = new BigDecimal("3495000000");
        assertEquals(expectedPopulation, result);
        assertTrue(europe.getListOfCountriesByContinent().contains(poland));
    }
}
