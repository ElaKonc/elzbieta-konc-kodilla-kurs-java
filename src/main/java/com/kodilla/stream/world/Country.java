package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    final private String nameCountry;
    final private BigDecimal populationOfCountry;

    public Country(String nameCountry, BigDecimal populationOfCountry) {
        this.nameCountry = nameCountry;
        this.populationOfCountry = populationOfCountry;
    }

    public BigDecimal getPeopleQuantity() {
        return populationOfCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return nameCountry.equals(country.nameCountry);
    }

    @Override
    public int hashCode() {
        return nameCountry.hashCode();
    }
}
