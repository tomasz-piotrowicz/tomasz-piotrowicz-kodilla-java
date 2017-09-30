package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public final class World {
    private final List<Continent> listOfWorldContinents = new ArrayList<>();

    public void add(Continent continent){
        listOfWorldContinents.add(continent);
    }

    public List<Continent> getListOfWorldContinents() {
        return listOfWorldContinents;
    }

    BigDecimal getPeopleQuantity(){
        return listOfWorldContinents.stream()
                .flatMap(c -> c.getListOfCountriesByContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
