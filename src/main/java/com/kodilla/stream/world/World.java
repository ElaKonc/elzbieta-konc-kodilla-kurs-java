package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    final private List<Continent> listOfContinents = new ArrayList<>();

    public boolean addContinents(Continent continent) {
        return listOfContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal worldPopulation = listOfContinents.stream().flatMap(continent -> continent.getListOfCountries().stream()).distinct().map(Country::getPeopleQuantity).reduce(BigDecimal.ZERO, (sum,country) -> sum.add(country));
        return worldPopulation;
    }
}
