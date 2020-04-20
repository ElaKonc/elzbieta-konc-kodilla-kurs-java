package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    final private String nameContinent;
    final private List<Country> listOfCountries = new ArrayList<>();

    public Continent(String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }

    public void addCountry(Country country) {
        listOfCountries.add(country);
    }
}
