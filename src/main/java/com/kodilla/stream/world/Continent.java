package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    final private String nameContinent;
    final private List<Country> listOfCountries = new ArrayList<>();

    public Continent(String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }

    public boolean addCountry(Country country) {
        return listOfCountries.add(country);
    }
}
