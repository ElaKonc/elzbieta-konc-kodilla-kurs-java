package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        World world = new World();

        Continent europe = new Continent("Europa");
        Continent asia = new Continent("Azja");
        Continent northAmerica = new Continent("Ameryka Północna");

        world.addContinents(europe);
        europe.addCountry(new Country("Polska", new BigDecimal("111111111111")));
        europe.addCountry(new Country("Niemcy", new BigDecimal("111111111111")));
        europe.addCountry(new Country("Francja", new BigDecimal("111111111111")));

        world.addContinents(asia);
        asia.addCountry(new Country("Chiny", new BigDecimal("111111111111")));
        asia.addCountry(new Country("Japonia", new BigDecimal("111111111111")));
        asia.addCountry(new Country("Indie", new BigDecimal("111111111111")));

        world.addContinents(northAmerica);
        northAmerica.addCountry(new Country("USA", new BigDecimal("111111111111")));
        northAmerica.addCountry(new Country("Kanada", new BigDecimal("111111111111")));
        northAmerica.addCountry(new Country("Meksyk", new BigDecimal("111111111111")));

        BigDecimal populationOfWorld = world.getPeopleQuantity();
        BigDecimal expectedPopulationOfWorld = new BigDecimal("999999999999");

        Assert.assertEquals(expectedPopulationOfWorld, populationOfWorld);
    }
}
