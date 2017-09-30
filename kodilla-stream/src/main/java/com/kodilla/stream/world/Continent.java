package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> listOfCountriesByContinent = new ArrayList<>();



    public List<Country> getListOfCountriesByContinent() {
        return listOfCountriesByContinent;
    }

    public void add(Country country){
        listOfCountriesByContinent.add(country);
    }
}



