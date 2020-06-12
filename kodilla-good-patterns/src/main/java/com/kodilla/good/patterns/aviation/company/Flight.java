package com.kodilla.good.patterns.aviation.company;

public class Flight {
    private final String airportDeparture;
    private final String airportArrival;
    private final int numberOfFlight;

    public Flight(String airportDeparture, String airportArrival, int numberOfFlight) {
        this.airportDeparture = airportDeparture;
        this.airportArrival = airportArrival;
        this.numberOfFlight = numberOfFlight;
    }

    public String getAirportDeparture() {
        return airportDeparture;
    }

    public String getAirportArrival() {
        return airportArrival;
    }

    public int getNumberOfFlight() {
        return numberOfFlight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (numberOfFlight != flight.numberOfFlight) return false;
        if (!airportDeparture.equals(flight.airportDeparture)) return false;
        return airportArrival.equals(flight.airportArrival);
    }

    @Override
    public int hashCode() {
        int result = airportDeparture.hashCode();
        result = 31 * result + airportArrival.hashCode();
        result = 31 * result + numberOfFlight;
        return result;
    }

    @Override
    public String toString() {
        return "Lot Z: '" + airportDeparture + '\'' +
                ", DO: '" + airportArrival + '\'' +
                "; numer lotu: '" + numberOfFlight +
                '\'';
    }
}
