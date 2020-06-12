package com.kodilla.good.patterns.aviation.company;

import java.util.HashSet;
import java.util.Set;

public class FlightsList {
    private Set<Flight> flights = new HashSet<>();

    public boolean addFlight(Flight flight) {
        flights.add(flight);
        return true;
    }

    public Set<Flight> getFlights() {
        return flights;
    }
}
