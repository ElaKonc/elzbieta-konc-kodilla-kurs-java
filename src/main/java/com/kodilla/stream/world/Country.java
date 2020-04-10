package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    final private String nameCountry;
    final private BigDecimal population;

    public Country(String nameCountry, BigDecimal population) {
        this.nameCountry = nameCountry;
        this.population = population;
    }

    public Country(String nameCountry){
        this(nameCountry, new BigDecimal("1111111111"));
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public BigDecimal getPeopleQuantity() {
        return population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (!nameCountry.equals(country.nameCountry)) return false;
        return population.equals(country.population);
    }

    @Override
    public int hashCode() {
        int result = nameCountry.hashCode();
        result = 31 * result + population.hashCode();
        return result;
    }
}
