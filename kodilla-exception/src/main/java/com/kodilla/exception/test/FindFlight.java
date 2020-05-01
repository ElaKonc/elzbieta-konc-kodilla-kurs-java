package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    private final Map<String, Boolean> airportMap;

    public FindFlight() {
        airportMap = airportDataBase();
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        if (airportMap.containsKey(flight.getArrivalAirport()) && airportMap.containsKey(flight.getDepartureAirport())) {
            return (airportMap.get(flight.getArrivalAirport()) && airportMap.get(flight.getDepartureAirport()));
        }else{
            throw new RouteNotFoundException("Lotnisko nie istnieje");
        }
    }

    private Map<String, Boolean> airportDataBase() {
        Map<String, Boolean> airportDataBase = new HashMap<>();
        airportDataBase.put("Warszawa", true);
        airportDataBase.put("Kraków", true);
        airportDataBase.put("Rzeszów", false);
        airportDataBase.put("Tokio", true);
        airportDataBase.put("Rzym", true);
        airportDataBase.put("Nowy Jork", false);

        return airportDataBase;
    }
}
