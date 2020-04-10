package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        Country poland = new Country("Polska");
        Country german = new Country("Niemcy");
        Country france = new Country("Francja");
        Country china = new Country("Chiny");
        Country japan = new Country("Japonia");
        Country india = new Country("Indie");
        Country usa = new Country("USA");
        Country canada = new Country("Kanada");
        Country mexico = new Country("Meksyk");

        Continent europe = new Continent("Europa");
        Continent asia = new Continent("Azja");
        Continent northAmerica = new Continent("Ameryka Północna");

        World world = new World();

        world.addContinents(europe);
        world.addContinents(asia);
        world.addContinents(northAmerica);

        europe.addCountry(poland);
        europe.addCountry(german);
        europe.addCountry(france);
        asia.addCountry(china);
        asia.addCountry(japan);
        asia.addCountry(india);
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(mexico);

        BigDecimal populationOfWorld = world.getPeopleQuantity();
        BigDecimal expectedPopulationOfWorld = new BigDecimal("9999999999");

        Assert.assertEquals(expectedPopulationOfWorld, populationOfWorld);
    }
}
