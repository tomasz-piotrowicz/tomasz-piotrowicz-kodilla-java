package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final BigDecimal countryQuantity;

    public Country(final BigDecimal peopleQuantity, final String countryName) {
        this.countryQuantity = peopleQuantity;
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getCountryQuantity() {
        return countryQuantity;
    }

    static BigDecimal getPeopleQuantity(Country country){
        return country.getCountryQuantity();
    }
}
