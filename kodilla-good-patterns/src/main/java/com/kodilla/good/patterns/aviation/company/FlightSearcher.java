package com.kodilla.good.patterns.aviation.company;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearcher {
    private Set<Flight> listOfFlights;

    public FlightSearcher(Set<Flight> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }

    public void searchByCityOfDeparture(String nameOfCityDeparture) {

        System.out.println("Lista lotów Z: " + nameOfCityDeparture + "\n");
        listOfFlights.stream()
                .filter(f -> f.getAirportDeparture().equals(nameOfCityDeparture))
                .map(f -> f.toString())
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchByCityOfArrival(String nameOfCityArrival) {

        System.out.println("Lista lotów DO: " + nameOfCityArrival + "\n");
        listOfFlights.stream()
                .filter(f -> f.getAirportArrival().equals(nameOfCityArrival))
                .map(f -> f.toString())
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchByCityForTransfer(String nameOfCityDeparture, String nameOfCityInterchange, String nameOfCityArrival) {

        System.out.println("Lista lotów Z: " + nameOfCityDeparture
                + " DO: " + nameOfCityArrival + " z PRZESIADKĄ w: " + nameOfCityInterchange + "\n");
        List<Flight> listOfFlightsWithInterChange = listOfFlights.stream()
                .filter(f -> f.getAirportDeparture().equals(nameOfCityDeparture) && f.getAirportArrival().equals(nameOfCityInterchange))
                .collect(Collectors.toList());
        listOfFlights.stream()
                .filter(f -> f.getAirportDeparture().equals(nameOfCityInterchange) && f.getAirportArrival().equals(nameOfCityArrival))
                .collect(Collectors.toCollection(() -> listOfFlightsWithInterChange));
        listOfFlightsWithInterChange.stream()
                .forEach(System.out::println);
    }
}
