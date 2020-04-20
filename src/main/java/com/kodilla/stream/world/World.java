package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    final private List<Continent> listOfContinents = new ArrayList<>();

    public void addContinents(Continent continent) {
        listOfContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return listOfContinents.stream()
                .flatMap(listOfCountries -> listOfCountries.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
